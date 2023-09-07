<template>
	<section>
		<!--工具条-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
			<el-form :inline="true" :model="filters">
				<el-form-item>

                <el-tooltip class="item" effect="dark" content="添加用户前请先创建地址类型" placement="right">
                     <el-button type="primary" @click="handleAdd">新增</el-button>
                </el-tooltip>

                </el-form-item>

			</el-form>
		</el-col>

		<!--列表-->
		<el-table :data="users" stripe border fit highlight-current-row v-loading="listLoading" @selection-change="selsChange" class="main-container" >
			<el-table-column type="selection" width="55">
			</el-table-column>

			<el-table-column type="index" label="ID" width="60">
			</el-table-column>

			<el-table-column prop="id" v-if="false">
			</el-table-column>

			<el-table-column prop="name" label="姓名" width="100" sortable>
			</el-table-column> 
			
			<el-table-column prop="nick" label="昵称" min-width="100" sortable>
			</el-table-column>

			<el-table-column prop="sex" label="性别" width="100" :formatter="formatSex" sortable>
			</el-table-column>
			
			<el-table-column prop="phone" label="电话号码" min-width="150" sortable>
			</el-table-column>

			<el-table-column prop="email" label="邮箱" min-width="150" sortable>
			</el-table-column>

			<el-table-column prop="areaType" v-if="false" label="地址类型" min-width="100" :formatter="formatName" sortable>
			</el-table-column>
			
			<el-table-column label="操作" width="300">
				<template slot-scope="scope">

					<el-button size="small" @click="EditPassword(scope.$index, scope.row)">重置密码</el-button>

				 	<el-button size="small" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
				  
					<!-- <el-button size="small" @click="handleEdit(scope.$index, scope.row)">编辑</el-button> -->
					<el-button type="danger" size="small" @click="handleDel(scope.$index, scope.row)">删除</el-button>

				</template>
			</el-table-column>
		</el-table>

		<!--工具条-->
		<el-col :span="24" class="toolbar_two">
			<el-button type="danger" @click="batchRemove" :disabled="this.sels.length===0">批量删除</el-button>
			<el-pagination layout="total, sizes, prev, pager, next, jumper"
			@current-change="handleCurrentChange" 
			@size-change="handleSizeChange"
			:page-size="limit"
			:page-sizes="[5, 10, 15,25]"
			:total="total" style="float:right;">
			</el-pagination>
		</el-col>

		<!--编辑界面-->
		<el-dialog title="编辑" :visible.sync="editFormVisible" :close-on-click-modal="false">
			<el-form :model="editForm" label-width="80px" :rules="editFormRules" ref="editForm">
				<el-form-item label="姓名" prop="name">
					<el-input v-model="editForm.name" ></el-input>
				</el-form-item>

				<el-form-item label="昵称" prop="nick">
					<el-input v-model="editForm.nick" ></el-input>
				</el-form-item>

              <!--   <el-form-item label="密码" prop="password">
					<el-input type="password" v-model="editForm.password" ></el-input>
				</el-form-item> -->

				<el-form-item label="性别">
					<el-radio-group v-model="editForm.sex">
						<el-radio class="radio" :label="1">男</el-radio>
						<el-radio class="radio" :label="2">女</el-radio>
					</el-radio-group>
				</el-form-item>

				<el-form-item label="地址类型">
					<!-- <el-input v-model="editForm.areaType"></el-input> -->
					<el-select v-model="editForm.areaType" @change="initProvince()" placeholder="请选择地址类型">
					 <el-option v-for="item in areaTypeList" :label="item.name" :value="item.id" :key="item.id" ></el-option>  
					</el-select>
				</el-form-item>
				<el-form-item label="乡村" prop="villageCode">
					<el-select v-model="editForm.provinceCode"  @change="changeProvince('e')" :disabled="provinceList.length == 0" clearable>
						<el-option v-for="item in provinceList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>
					<el-select v-model="editForm.cityCode" @change="changeCity('e')" :disabled="cityList.length == 0" clearable>
						<el-option v-for="item in cityList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>
					<el-select v-model="editForm.countyCode" ref="countyRef1" @change="changeCounty('e')" :disabled="countyList.length == 0" clearable>
						<el-option v-for="item in countyList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>
					<el-select v-model="editForm.townCode" ref="townRef1" @change="changeTown('e')" :disabled="townList.length == 0" clearable>
						<el-option v-for="item in townList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>
					<el-select v-model="editForm.villageCode" ref="villageRef1" @change="$forceUpdate()" :disabled="villageList.length == 0" clearable>
						<el-option v-for="item in villageList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>					
				</el-form-item>
				<el-form-item label="邮箱">
					<el-input  v-model="editForm.email"></el-input>
				</el-form-item>

				<el-form-item label="电话号码">
					<el-input v-model="editForm.phone"></el-input>
				</el-form-item>

			</el-form>
			<div slot="footer" class="dialog-footer">
				<el-button @click.native="editFormVisible = false">取消</el-button>
				<el-button type="primary" @click.native="editSubmit" :loading="editLoading">提交</el-button>
			</div>
		</el-dialog>
        <!-- v-model -->
		<!--新增界面-->
		<el-dialog title="新增" :visible.sync="addFormVisible"  :close-on-click-modal="false" >
			<el-form :model="addForm" label-width="80px" :rules="addFormRules" ref="addForm">
				<el-form-item label="姓名" prop="name">
					<el-input v-model="addForm.name" auto-complete="off"></el-input>
				</el-form-item>

				<el-form-item label="昵称">
					<el-input v-model="addForm.nick" auto-complete="off"></el-input>
				</el-form-item>

				<el-form-item  label="密码" prop="password">
					<el-input type="password" v-model="addForm.password" auto-complete="off"></el-input>
				</el-form-item>

				<el-form-item label="性别"> 
					<el-radio-group v-model="addForm.sex">
						<el-radio class="radio" :label="1">男</el-radio>
						<el-radio class="radio" :label="2">女</el-radio>
					</el-radio-group> 
				</el-form-item>
				
				<el-form-item label="地址类型" prop="areaType">
					<!-- <el-input v-model="addForm.areaType"></el-input> -->
					<el-select v-model="addForm.areaType" @change="initProvince()" placeholder="请选择地址类型">
					 <el-option v-for="item in areaTypeList" :label="item.name" :value="item.id" :key="item.id" ></el-option>   
					</el-select>
				</el-form-item>
				<el-form-item label="乡村" prop="villageCode">
					<el-select v-model="addForm.provinceCode"  @change="changeProvince('a')" :disabled="provinceList.length == 0" clearable>
						<el-option v-for="item in provinceList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>
					<el-select v-model="addForm.cityCode" @change="changeCity('a')" :disabled="cityList.length == 0" clearable>
						<el-option v-for="item in cityList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>
					<el-select v-model="addForm.countyCode" ref="countyRef" @change="changeCounty('a')" :disabled="countyList.length == 0" clearable>
						<el-option v-for="item in countyList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>
					<el-select v-model="addForm.townCode" ref="townRef" @change="changeTown('a')" :disabled="townList.length == 0" clearable>
						<el-option v-for="item in townList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>
					<el-select v-model="addForm.villageCode" ref="villageRef" @change="$forceUpdate()" :disabled="villageList.length == 0" clearable>
						<el-option v-for="item in villageList" :key="item.code" :label="item.name" :value="item.code"></el-option>
					</el-select>					
				</el-form-item>
				<el-form-item label="邮箱">
					<el-input  v-model="addForm.email"></el-input>
				</el-form-item>

				<el-form-item label="电话号码" prop="phone">
					<el-input  v-model="addForm.phone"></el-input>
				</el-form-item>

			</el-form>
			<div slot="footer" class="dialog-footer">
				<el-button @click.native="addFormVisible = false">取消</el-button>
				<el-button type="primary" @click.native="addSubmit" :loading="addLoading">提交</el-button>
			</div>
		</el-dialog>


        <!--改密界面-->
		<el-dialog title="重置用户密码" :visible.sync="editPasswordVisible" :close-on-click-modal="false">
			<el-form :model="editPassword" label-width="150px" :rules="editPasswordRules" ref="editPassword">

                <el-form-item  label="用户信息">
					<el-input type="text" :disabled="true" v-model="editPassword.name" auto-complete="off"></el-input>
					
				</el-form-item>

				<el-form-item  label="请输入新密码">
					<el-input type="password" v-model="editPassword.password" auto-complete="off"></el-input>
					
				</el-form-item>

				<el-form-item  label="请再次输入新密码">
					<el-input type="password" v-model="editPassword.passwordagain" auto-complete="off"></el-input>
					
				</el-form-item>

			</el-form>
			<div slot="footer" class="dialog-footer">
				<el-button @click.native="editPasswordVisible = false">取消</el-button>
				<el-button type="primary" @click.native="decidePassword" :loading="editPasswordLoading">提交</el-button>
			</div>
		</el-dialog> 

	</section>
</template>

<script >
	import util from '@/common/js/util'
    //import md5 from 'js-md5';
	//import NProgress from 'nprogress'
	import {updatePasswordRequest,listUsersRequest, removeUserRequest, addUserRequest,updateUserRequest } from '@/api/member';
    //import {listDepartRequest} from '@/api/depart'
    import {listAreaRequest,userAreaRequest} from '@/api/area'

	export default {
		data() {
			return {
				filters: {
					name: ''
				},
				users: [],
				total: 0,
				page: 1,
				limit: 10,
				departs :[],
				num : 0,
                areaTypeList  : [
                               {"id":1,"name":"籍贯"},
                               {"id":2,"name":"工作地"},
                               {"id":3,"name":"常住地"}],

				listLoading: false,
				sels: [],//列表选中列

				editFormVisible: false,//编辑界面是否显示
				editLoading: false,
				editFormRules: {
					name: [
						{ required: true, message: '请输入姓名', trigger: 'blur' }
					]
				},
				//编辑界面数据
				editForm: {
					id: 0,
					name: '',
					nick:'',
					//password:'',
					sex: 0,
				    areaType:null,
				    phone:'',
					email: '',
					provinceCode: "",	//省
					cityCode: "",  //市
					countyCode: "",   //区县
					county: "",   //区县
					townCode: "",//乡
					town: "",//乡
					villageCode: "",//村的数据
					village: "",//村的数据						
				},

				addFormVisible: false,//新增界面是否显示
				addLoading: false,
				addFormRules: {
					name: [
						{ required: true, message: '请输入姓名', trigger: 'blur' }
					],
					password: [
						{ required: true, message: '请输入密码', trigger: 'blur' }
					],
					areaType: [
						{ required: true, message: '请输入地址类型'}
					],					
					provinceCode: [
						{ required: true, message: '请输入省份', trigger: 'blur' }
					],
					cityCode: [
						{ required: true, message: '请输入城市', trigger: 'blur' }
					],
					countyCode: [
						{ required: true, message: '请输入区县', trigger: 'blur' }
					],
					townCode: [
						{ required: true, message: '乡镇数据为空', trigger: 'blur' }
					],
					villageCode: [
						{ required: true, message: '村数据为空', trigger: 'blur' }
					],
					phone:[
						{ required: true, message: '请输入电话号码'}
					]
				},
				provinceList:  [],//省的数组
				cityList: [],//市的数组
				countyList: [],//区县数据
				townList: [],//乡数据
				villageList: [],//村数据
				//新增界面数据
				addForm: {
					name: '',
					nick:'',
					password:'',
					sex: 0,
				    areaType: null,
				    phone:'',
					email: '',
					provinceCode: "",	//省
					cityCode: "",  //市
					countyCode: "",   //区县
					county: "",   //区县
					townCode: "",//乡
					town: "",//乡
					villageCode: "",//村的数据
					village: "",//村的数据			
				},

				editPasswordVisible: false,//改密界面是否显示
				editPasswordLoading: false,//改密界面是否加载
				editPasswordRules:{        //改密界面文本框填写规则					
					password: [
						{ required: true, message: '请输入新密码', trigger: 'blur' }
					],
					passwordagain: [
						{ required: true, message: '请再次输入新密码', trigger: 'blur' }
					],
					areaType: [
						{ required: true, message: '请输入地址类型'}
					],					
					provinceCode: [
						{ required: true, message: '请输入省份', trigger: 'blur' }
					],
					cityCode: [
						{ required: true, message: '请输入城市', trigger: 'blur' }
					],
					countyCode: [
						{ required: true, message: '请输入区县', trigger: 'blur' }
					],
					townCode: [
						{ required: true, message: '乡镇数据为空', trigger: 'blur' }
					],
					villageCode: [
						{ required: true, message: '村数据为空', trigger: 'blur' }
					],
					phone:[
						{ required: true, message: '请输入电话号码'}
					]					
				},
				editPassword : {  //改密界面数据
					id:'',
					name:'',
					password:'',
					passwordagain:''
				},
			}
		},
		methods: {
			decidePassword (){
              
                   if(this.editPassword.password!=this.editPassword.passwordagain)
                   {
                     this.$message({
									message: '两次密码不一致',
									type: 'warning'
								});
                   }
                   else{
                   	this. passwordSubmit();
                   }
                   
			},
            formatName :function(row){
                     
                 for(var j=0 ; j<this.areaTypeList.length ; j++){
                     var cp =
                     {  
                     	id:0,
                     	name:""
                     }
                     cp=this.areaTypeList[j];
                     if(row.areaType==cp.id){
                     	return cp.name;
                     }
                     else{}
                 }
                 row.areaType=0;
                 return "未知";
			},
			//性别显示转换
			formatSex: function (row, column) {
				return row.sex == 1 ? '男' : row.sex == 2 ? '女' : '未知';
			},
			handleCurrentChange(val) {
				this.page = val;
				this.getUsers();
			},
			handleSizeChange(val) {
				this.limit  = val;
				this.getUsers();
			},			
			//获取用户列表
			async getUsers() {
				let para = {
					curPage: this.page,
					pageSize: this.limit,
					name: this.filters.name
				};
				this.listLoading = true;
				//NProgress.start();
				
                /* listDepartRequest(para).then(res => {
                        this.departs =JSON.parse(res.data.data).depart;
                        this.num = this.departs.length;
                        this.areaTypeList = [{id:0,name:"无地址类型"}];
                    for(var key in this.departs){
                        this.areaTypeList.push({id:this.departs[key].id, name:this.departs[key].departname});
                    } */
              
				await listUsersRequest(para).then(data => {
					if(data.data.code==1){
						this.users=[];
						this.total=0;
						this.listLoading = false;
					}
					else if (data.data.code==0)
					{  
                       this.users = JSON.parse(data.data.data).user;
					   this.total = JSON.parse(data.data.data).total;
					   this.listLoading = false;
					}
					else{
						this.listLoading=false;
						this.$message({
							message:'获取用户数据失败',
							type:'warning'
						});
					} 
					
					//NProgress.done();
				});
			    //});
			},
			//删除
			handleDel: function (index, row) {
				this.$confirm('确认删除该记录吗?', '提示', {
					type: 'warning'
				}).then(() => {
					this.listLoading = true;
					//NProgress.start();
                 
					let para =[];
					para.push(row.id);   
                    
					removeUserRequest(para).then(data => {
						this.listLoading = false;
						//NProgress.done();
						console.log(data)
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
    					this.getUsers();
					});
				}).catch(() => {

				});
			},
			//显示编辑界面
			handleEdit: function (index, row) {
				var cp = {"id":0,"name":"未知"};
				if (this.areaTypeList[0].name != "未知") { this.areaTypeList.unshift(cp); }
				this.editFormVisible = true;
				this.editForm = Object.assign({}, row);
				/*this.editForm ={
                    name: '',
					password:'',
					sex: -1,
					age: 0,
					birth: '',
					email: ''
				};*/
				this.editShowArea(row.id);
			},
			//显示改密界面
			EditPassword: function (index, row) {
				this.$confirm('确认重置密码吗?', '提示', {
                    type: 'warning'
                }).then(() => {
                
                	this.editPasswordVisible = true;
                	this.editPassword={
                		name:'',
                		password:'',
                		passwordagain:''
                	};
                	this.editPassword.name=row.name;
                	this.editPassword.id=row.id;

                }).catch(() => { });

			},
			//显示新增界面
			handleAdd: function () {
				this.addFormVisible = true;
				this.addForm = {
					name: '',
					nick:'',
					password:'',
					sex: 0,
				    areaType:null,
				    phone:'',
					email: '',
					provinceCode:'',
					cityCode: '',
					countyCode: '',
					county: '',
					townCode: '',
					town: '',
					villageCode: '',
					village:'',
				};
				if (this.areaTypeList[0].name == "未知") { this.areaTypeList.splice(0, 1); }
			},
			//编辑
			editSubmit: function () {
				this.$refs.editForm.validate((valid) => {
					if (valid) {
						this.$confirm('确认提交吗？', '提示', {}).then(() => {
							this.editLoading = true;
							//NProgress.start();
							//this.editForm.password=this.md5(this.editForm.password);
							this.editForm.county=this.$refs.countyRef1.selectedLabel;
							this.editForm.town=this.$refs.townRef1.selectedLabel;
							this.editForm.village=this.$refs.villageRef1.selectedLabel;
							this.editForm.updateUser=this.$store.getters.manager_id;
							let para = Object.assign({}, this.editForm);
							//para.birth = (!para.birth || para.birth == '') ? '' : util.formatDate.format(new Date(para.birth), 'yyyy-MM-dd');
							updateUserRequest(para).then(data => {
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
								this.getUsers();
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
							this.addForm.password=this.md5(this.addForm.password);
							/* let countyObj,townObj,villageObj = {};
							countyObj = this.countyList.find(item => item.code = this.addForm.countyCode);
							this.addForm.county=countyObj.name;
							townObj = this.townList.find(item => item.code = this.addForm.townCode);
							this.addForm.town=townObj.name;
							villageObj = this.villageList.find(item => item.code = this.addForm.villageCode);
							this.addForm.village=villageObj.name; */
							
							this.addForm.county=this.$refs.countyRef.selectedLabel;
							this.addForm.town=this.$refs.townRef.selectedLabel;
							this.addForm.village=this.$refs.villageRef.selectedLabel;
							let para = Object.assign({}, this.addForm);
							//para.birth = (!para.birth || para.birth == '') ? '' : util.formatDate.format(new Date(para.birth), 'yyyy-MM-dd');
							addUserRequest(para).then(data => {
								this.addLoading = false;
								if(data.data.code==0){
                                   this.$message({
									message: '提交成功',
									type: 'success'
								});
								} else if(data.data.code==1){
									this.$message({
									message: '提交失败',
									type: 'warning'
								});
								} else {
									this.$message({
										message: '服务器或网络错误',
										type: 'error'
									});
								}
								
								this.$refs['addForm'].resetFields();
								this.addFormVisible = false;
								this.getUsers();
							});
						});
					}
				});
			},
			//改密
			passwordSubmit: function () {
				this.$refs.editPassword.validate((valid) => {
					if (valid) {
						this.$confirm('确认提交吗？', '提示', {}).then(() => {
							this.editPasswordLoading = true;
							
						  
							this.editPassword.password=this.md5(this.editPassword.password);
                            //console.log(this.editPassword.id);
					        
					        let para ={id:this.editPassword.id,password:this.editPassword.password};
			   
						    //console.log("内容是:"+para);
							updatePasswordRequest(para).then(data => {

								this.editPasswordLoading = false;
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
								} else {
									this.$message({
										message: '服务器或网络错误',
										type: 'error'
									});
								}
								this.$refs['editPassword'].resetFields();
								this.editPasswordVisible = false;
								this.getUsers();
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
                let sss =this.sels.map(item => item.id);
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
					removeUserRequest(idss).then(data => {
						this.listLoading = false;
						//NProgress.done();
						if(data.data.code==0){
                                this.$message({
								message: '删除成功',
								type: 'success'
							});
							} else if(data.data.code==1){
								this.$message({
								message: '删除失败',
								type: 'warning'
							});
							} else {
								this.$message({
								message: '服务器或网络错误',
								type: 'error'
								});
								}
						this.getUsers();
					});
				}).catch(() => {

				});
			},
			async initProvince() {
				let _self = this;
				_self.cityList = [];
				_self.addForm.cityCode = "";
				_self.editForm.cityCode = "";
				_self.countyList = [];
				_self.addForm.countyCode = "";
				_self.editForm.countyCode = "";
				_self.townList = [];
				_self.addForm.townCode = "";
				_self.editForm.townCode = "";
				_self.villageList = [];
				_self.addForm.villageCode = "";
				_self.editForm.villageCode = "";
                await listAreaRequest().then(data => {
					if(data.data.code==1){
						this.$message({
							message:'无区域数据',
							type:'warning'
						});
					} else if(data.data.code==0) {
                       let provinces = JSON.parse(data.data.data).area;
					   for(var key in provinces){
						   let codeStr = provinces[key].area_code;
                           this.provinceList.push({code:codeStr, name:codeStr.substring(0, 2) + provinces[key].name});
                        }
                              
					} else {
						this.$message({
							message:'获取区域数据失败',
							type:'warning'
						});
					}
			    });
			},
			// 选择省的点击事件
			async changeProvince(flag,provinceCode) {
				let _self = this;
				_self.cityList = [];
				_self.countyList = [];
				_self.townList = [];
				_self.villageList = [];
				if(flag == "a") {
					_self.addForm.cityCode = "";
					_self.addForm.countyCode = "";
					_self.addForm.townCode = "";
					_self.addForm.villageCode = "";
					provinceCode = this.addForm.provinceCode;
				}else if(flag == "e"){
					_self.editForm.cityCode = "";
					_self.editForm.countyCode = "";
					_self.editForm.townCode = "";
					_self.editForm.villageCode = "";
					if(provinceCode == undefined || provinceCode == "") {
						provinceCode = this.editForm.provinceCode
					}
				}
			
				let para ={areaCode:provinceCode,levelCode:1, name:"",pinyin:""};
				await listAreaRequest(para).then(data => {
					if(data.data.code==1){
						this.$message({
							message:'无区域数据',
							type:'warning'
						});
					} else if(data.data.code==0) {
                       let citys = JSON.parse(data.data.data).area;
					   for(var key in citys){
                           this.cityList.push({code:citys[key].area_code, name: citys[key].name});
                        }
                              
					} else {
						this.$message({
							message:'获取区域数据失败',
							type:'warning'
						});
					}
			    });
			},
			// 选择市的点击事件
			async changeCity(flag,cityCode) {
				let _self = this;
				_self.countyList = [];
				_self.townList = [];
				_self.villageList = [];
				if(flag == "a") {
					_self.addForm.countyCode = "";
					_self.addForm.townCode = "";
					_self.addForm.villageCode = "";
					cityCode = this.addForm.cityCode;
				}else if(flag == "e"){
					_self.editForm.countyCode = "";
					_self.editForm.townCode = "";
					_self.editForm.villageCode = "";
					if(cityCode == undefined || cityCode == "") {
						cityCode = this.editForm.cityCode;
					}
				}
				let para ={areaCode:cityCode,levelCode:2, name:"",pinyin:""};
				await listAreaRequest(para).then(data => {
					if(data.data.code==1){
						this.$message({
							message:'无区域数据',
							type:'warning'
						});
					} else if(data.data.code==0) {
                       let countys = JSON.parse(data.data.data).area;
					   for(var key in countys){
                           this.countyList.push({code:countys[key].area_code, name: countys[key].name});
                        }
                              
					} else {
						this.$message({
							message:'获取区域数据失败',
							type:'warning'
						});
					}
			    });
			},
			// 选择区县的点击事件
			async changeCounty(flag,countyCode) {
				let _self = this;
				_self.townList = [];
				_self.villageList = [];
				if(flag == "a") {
					_self.addForm.townCode = "";
					_self.addForm.villageCode = "";
					countyCode = this.addForm.countyCode;
				}else if(flag == "e"){
					_self.editForm.townCode = "";
					_self.editForm.villageCode = "";
					if(countyCode == undefined || countyCode == "") {
						countyCode = this.editForm.countyCode;
					}
				}
				let para ={areaCode:countyCode,levelCode:3, name:"",pinyin:""};
				await listAreaRequest(para).then(data => {
					if(data.data.code==1){
						this.$message({
							message:'无区域数据',
							type:'warning'
						});
					} else if(data.data.code==0) {
                       let towns = JSON.parse(data.data.data).area;
					   for(var key in towns){
                           this.townList.push({code:towns[key].area_code, name: towns[key].name});
                        }
                              
					} else {
						this.$message({
							message:'获取区域数据失败',
							type:'warning'
						});
					}
			    });
			},
			// 选择乡镇的点击事件
			async changeTown(flag,townCode) {
				let _self = this;
				_self.villageList = [];
				if(flag == "a") {
					_self.addForm.villageCode = "";
					townCode = this.addForm.townCode;
				}else if(flag == "e"){
					_self.editForm.villageCode = "";
					if(townCode == undefined || townCode == "") {
						townCode = this.editForm.townCode;
					}
				}
				let para ={areaCode:townCode,levelCode:4, name:"",pinyin:""};
				await listAreaRequest(para).then(data => {
					if(data.data.code==1){
						this.$message({
							message:'无区域数据',
							type:'warning'
						});
					} else if(data.data.code==0) {
                       let villages = JSON.parse(data.data.data).area;
					   for(var key in villages){
							this.villageList.push({code:villages[key].area_code, name: villages[key].name});
                        }
                              
					} else {
						this.$message({
							message:'获取区域数据失败',
							type:'warning'
						});
					}
			    });
			},
			// 加载地区事件
			editShowArea(id) {
				let userId = id
				userAreaRequest(userId).then(data => {
					if(data.data.code==1){
						this.$message({
							message:'无区域数据',
							type:'warning'
						});
					} else if(data.data.code==0) {
                        let areaObj = JSON.parse(data.data.data);
						this.editForm.areaType = areaObj.areaType;
					    this.initProvince();
					    this.editForm.provinceCode = areaObj.provinceCode;
					    this.changeProvince("e",areaObj.provinceCode);
						this.editForm.cityCode = areaObj.cityCode;
						this.changeCity("e",areaObj.cityCode)
						this.editForm.countyCode = areaObj.countyCode;
						this.changeCounty("e",areaObj.countyCode);
						this.editForm.townCode = areaObj.townCode;
						this.changeTown("e",areaObj.townCode);
						this.editForm.villageCode = areaObj.villageCode;
					} else {
						this.$message({
							message:'获取区域数据失败',
							type:'warning'
						});
					}
			    });
			},			
		},	
		mounted() {
			this.getUsers();
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