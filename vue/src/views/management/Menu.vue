<template>
    <section>
        <!--工具条-->
        <el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
            <el-form :inline="true" :model="filters">
                <el-form-item>
                    <el-button type="primary" @click="handleAdd">新增</el-button>
                </el-form-item>
            </el-form>
        </el-col>

        <!--列表-->
        <el-table :data="menus" stripe border fit highlight-current-row v-loading="listLoading" @selection-change="selsChange" class="main-container" >
            <el-table-column type="selection" width="55">
            </el-table-column>

            <el-table-column prop="menu_id" label="权限ID" width="90" sortable>
            </el-table-column>

            <el-table-column prop="menu_name" label="权限名称" min-width="120" sortable>
            </el-table-column> 
            
            <el-table-column prop="menu_url" label="权限URL" min-width="200" sortable>
            </el-table-column> 

            <el-table-column prop="parent_id" label="父权限ID" min-width="100" sortable>
            </el-table-column> 
            
            <el-table-column label="操作" width="300">
                <template slot-scope="scope">
                    <el-button size="small" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                    <el-button type="danger" size="small" @click="handleDel(scope.$index, scope.row)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>

        <!--工具条-->
        <el-col :span="24" class="toolbar_two">
            <el-button type="danger" @click="batchRemove" :disabled="this.sels.length===0">批量删除</el-button>
            <el-pagination layout="prev, pager, next" @current-change="handleCurrentChange" :page-size="20" :total="total" style="float:right;">
            </el-pagination>
        </el-col>

        <!--编辑界面-->
        <el-dialog title="编辑" :visible.sync="editFormVisible" :close-on-click-modal="false">
            <el-form :model="editForm" label-width="100px" :rules="editFormRules" ref="editForm">
                <el-form-item label="权限名称" prop="menu_name">
                    <el-input v-model="editForm.menuName" ></el-input>
                </el-form-item>

                <el-form-item label="权限URL" prop="menu_url">
                    <el-input v-model="editForm.menuUrl" ></el-input>
                </el-form-item>
                
                <el-form-item label="父权限ID" prop="parent_id">
                    <el-input v-model="editForm.parentId" ></el-input>
                </el-form-item>

            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button @click.native="editFormVisible = false">取消</el-button>
                <el-button type="primary" @click.native="editSubmit" :loading="editLoading">提交</el-button>
            </div>
        </el-dialog>

        <!--新增界面-->
        <el-dialog title="新增" :visible.sync="addFormVisible"  :close-on-click-modal="false" >
            <el-form :model="addForm" label-width="80px" :rules="addFormRules" ref="addForm">
                <el-form-item label="权限名称" prop="menu_name">
                    <el-input v-model="addForm.menuName" auto-complete="off"></el-input>
                </el-form-item>

                <el-form-item  label="权限URL" prop="menu_url">
                    <el-input type="text" v-model="addForm.menuUrl" auto-complete="off"></el-input>
                </el-form-item>

                <el-form-item label="父权限ID" prop="parent_id">
                    <el-input v-model="addForm.parentId" auto-complete="off"></el-input>
                </el-form-item>

            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button @click.native="addFormVisible = false">取消</el-button>
                <el-button type="primary" @click.native="addSubmit" :loading="addLoading">提交</el-button>
            </div>
        </el-dialog>
        
        

    </section>
</template>

<script >
    import util from '@/common/js/util'
    //import md5 from 'js-md5';
    //import NProgress from 'nprogress'
    import { listMenuRequest,addMenuRequest,removeMenuRequest,updateMenuRequest } from '@/api/menu'
    
  
    export default {
        data() {
            return {
                filters: {
                    menu_name: ''
                },
                menus: [],
                
                total: 0,
                page: 1,


                listLoading: false,
                sels: [],//列表选中列
                
               


                editFormVisible: false,//编辑界面是否显示
                editLoading: false,
                editFormRules: {
                    menuName: [
                        { required: true, message: '请输入权限名称', trigger: 'blur' }
                    ],
                    menuUrl: [
                        { required: true, message: '请输入权限url', trigger: 'blur' }
                    ],
                    parentId: [
                        { required: true, message: '请输入父权限Id', trigger: 'blur' }
                    ],
                },
                //编辑界面数据
                editForm: {
                    menuName: '',
                    menuUrl: '',
                    parentId: 0
                },

                addFormVisible: false,//新增界面是否显示
                addLoading: false,
                addFormRules: {
                    menuName: [
                        { required: true, message: '请输入权限名称', trigger: 'blur' }
                    ],
                    menuUrl: [
                        { required: true, message: '请输入权限url', trigger: 'blur' }
                    ],
                    parentId: [
                        { required: true, message: '请输入父权限Id', trigger: 'blur' }
                    ],
                },
                //新增界面数据
                addForm: {
                    menuName : '',
                    menuUrl : '',
                    parentId : 0
                }
            }
        },
        methods: {
            handleCurrentChange(val) {
                this.page = val;
                this.getMenus();
            },
            //获取权限列表
            getMenus() {
                let para = {
                    page: this.page,
                    menu_name: this.filters.menu_name
                };
                this.listLoading = true;
                //NProgress.start();
                
                listMenuRequest(para).then(res => {
                    if(res.data.code==1){
                        this.menus=[];
                        this.total=0;
                        this.listLoading = false;
                    }
                    else if (res.data.code==0)
                    {  
                       this.menus = JSON.parse(res.data.data).menu;
                       this.total = this.menus.length; 
                       this.listLoading = false;
                    }
                    else{
                        this.listLoading=false;
                        this.$message({
                            message:'获取权限数据失败',
                            type:'warning'
                        });
                    }  
                    //NProgress.done();
                });
            },
            //删除
            handleDel: function (index, row) {
                this.$confirm('确认删除该记录吗?', '提示', {
                    type: 'warning'
                }).then(() => {
                    this.listLoading = true;
                    //NProgress.start();
                 
                    let para =[];
                    para.push(row.menu_id);   

                    removeMenuRequest(para).then(data => {
                        this.listLoading = false;
                        //NProgress.done();
                        if(data.data.code==0){
                                this.$message({
                                message: '删除成功',
                                type: 'success'
                            });
                                
                            }
                            else if(data.data.code==1){
                                this.$message({
                                message: '删除失败',
                                type: 'warning'
                            });
                            }
                            else {
                                    this.$message({
                                    message: '服务器或网络错误',
                                    type: 'error'
                                });
                            }
                        this.getMenus();
                    });
                }).catch(() => {

                });
            },
            //显示编辑界面
            handleEdit: function (index, row) {
                this.editFormVisible = true;
                this.editForm ={
                    menuId : row.menu_id,
                    menuName : row.menu_name,
                    menuUrl : row.menu_url,
                    parentId : row.parent_id
                };
            },
            //显示新增界面
            handleAdd: function () {
                this.addFormVisible = true;
                this.addForm = {
                    menuName: '',
                    menuUrl:'',
                    parentId:0
                };
            },
            //编辑
            editSubmit: function () {
                this.$refs.editForm.validate((valid) => {
                    if (valid) {
                        this.$confirm('确认提交吗？', '提示', {}).then(() => {
                            this.editLoading = true;
                            //NProgress.start();
                            //this.editForm.password=this.md5(this.editForm.password);
                            let para = Object.assign({}, this.editForm);
                            //para.birth = (!para.birth || para.birth == '') ? '' : util.formatDate.format(new Date(para.birth), 'yyyy-MM-dd');
                            updateMenuRequest(para).then(data => {
                                this.editLoading = false;
                                //NProgress.done();
                                if(data.data.code==0){
                                   this.$message({
                                    message: '提交成功',
                                    type: 'success'
                                });
                                   
                                }
                                else if(data.data.code==1){
                                    this.$message({
                                    message: '提交失败',
                                    type: 'warning'
                                });
                                }
                                else {
                                    this.$message({
                                        message: '服务器或网络错误',
                                        type: 'error'
                                    });
                                }
                                this.$refs['editForm'].resetFields();
                                this.editFormVisible = false;
                                this.getMenus();
                            });
                        });
                    }
                });
            },
            //新增
            addSubmit: function () {
                this.$refs.addForm.validate((valid) => {
                    if (valid) {
                        this.$confirm('确认提交吗？', '提示', {}).then(() => {
                            this.addLoading = true;
                            //NProgress.start();
                            let para = Object.assign({}, this.addForm);
                            //para.birth = (!para.birth || para.birth == '') ? '' : util.formatDate.format(new Date(para.birth), 'yyyy-MM-dd');
                            addMenuRequest(para).then(data => {
                                
                                this.addLoading = false;
                                if(data.data.code==0){
                                   this.$message({
                                    message: '提交成功',
                                    type: 'success'
                                });
                                  
                                }
                                else if(data.data.code==1){
                                    this.$message({
                                    message: '提交失败',
                                    type: 'warning'
                                });
                                }
                                else {
                                    this.$message({
                                        message: '服务器或网络错误',
                                        type: 'error'
                                    });
                                }
                               this.addFormVisible = false;
                               this.$refs['addForm'].resetFields();
                               this.getMenus(); 
                            });
                        });
                    }
                });
            },
            selsChange: function (sels) {
                this.sels = sels;
            },
            //批量删除
            batchRemove: function () {
                //console.log(this.sels.map(item => item.id));
                //var ids = this.sels.map(item => item.id).toString();
                
                let idss=[ ];
                let sss =this.sels.map(item => item.menu_id);
                for(var key in sss)  
                {
                     idss.push(sss[key])  ;  
                };

                //console.log(idss);

            
                this.$confirm('确认删除选中记录吗？', '提示', {
                    type: 'warning'
                }).then(() => {
                    this.listLoading = true;
                    //NProgress.start();
                    removeMenuRequest(idss).then(data => {
                        this.listLoading = false;
                        //NProgress.done();
                        if(data.data.code==0){
                                this.$message({
                                message: '删除成功',
                                type: 'success'
                            });

                            }
                            else if(data.data.code==1){
                                this.$message({
                                message: '删除失败',
                                type: 'warning'
                            });
                            }
                            else {
                                this.$message({
                                message: '服务器或网络错误',
                                type: 'error'
                                });
                                }
                        this.getMenus();
                    });
                }).catch(() => {

                });
            }
        },
        mounted() {
            this.getMenus();
        }
    }

</script>


<style  scoped lang="scss">
    .main-container{
        width: 100%;
        margin: 20px;
    }
    .toolbar{
        margin-left: 40px;
        margin-top: 20px;
    }
    .toolbar_two{
        margin-left: 20px;
    }

</style>