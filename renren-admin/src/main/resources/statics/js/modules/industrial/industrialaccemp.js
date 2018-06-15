$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'industrial/industrialaccemp/list',
        datatype: "json",
        colModel: [			
			{ label: 'empId', name: 'empId', index: 'emp_id', width: 50, key: true },
			{ label: '姓名', name: 'empName', index: 'emp_name', width: 80 }, 			
			{ label: '性别', name: 'empSex', index: 'emp_sex', width: 80 }, 			
			{ label: '出生年月', name: 'empBirthday', index: 'emp_Birthday', width: 80 }, 			
			{ label: '学历', name: 'empEdu', index: 'emp_edu', width: 80 }, 			
			{ label: '政治面貌', name: 'empPolitics', index: 'emp_politics', width: 80 }, 			
			{ label: '身份证号码', name: 'empCertificateNumber', index: 'emp_certificate_number', width: 80 }, 			
			{ label: '户籍地址', name: 'empRegistered', index: 'emp_Registered', width: 80 }, 			
			{ label: '移动电话', name: 'empMob', index: 'emp_mob', width: 80 }, 			
			{ label: '固定电话', name: 'empTel', index: 'emp_tel', width: 80 }, 			
			{ label: '通讯地址', name: 'empAdd', index: 'emp_add', width: 80 }, 			
			{ label: '紧急联系人', name: 'empEmergencyContact', index: 'emp_emergency_contact', width: 80 }, 			
			{ label: '紧急联系人电话', name: 'empEmergencyTel', index: 'emp_emergency_tel', width: 80 }, 			
			{ label: '备注', name: 'remark', index: 'remark', width: 80 }, 			
			{ label: '身份证照片', name: 'empCertificatePic', index: 'emp_certificate_pic', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		industrialAccEmp: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.industrialAccEmp = {};
		},
		update: function (event) {
			var empId = getSelectedRow();
			if(empId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(empId)
		},
		saveOrUpdate: function (event) {
			var url = vm.industrialAccEmp.empId == null ? "industrial/industrialaccemp/save" : "industrial/industrialaccemp/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.industrialAccEmp),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var empIds = getSelectedRows();
			if(empIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "industrial/industrialaccemp/delete",
                    contentType: "application/json",
				    data: JSON.stringify(empIds),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(empId){
			$.get(baseURL + "industrial/industrialaccemp/info/"+empId, function(r){
                vm.industrialAccEmp = r.industrialAccEmp;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});