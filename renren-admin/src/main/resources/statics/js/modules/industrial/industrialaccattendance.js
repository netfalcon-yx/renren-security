$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'industrial/industrialaccattendance/list',
        datatype: "json",
        colModel: [			
			{ label: 'attendanceId', name: 'attendanceId', index: 'attendance_id', width: 50, key: true },
			{ label: '员工编号', name: 'empId', index: 'emp_id', width: 80 }, 			
			{ label: '年月', name: 'ym', index: 'ym', width: 80 }, 			
			{ label: '年月', name: 'maxday', index: 'maxday', width: 80 }, 			
			{ label: '', name: 'd1', index: 'd1', width: 80 }, 			
			{ label: '', name: 'd2', index: 'd2', width: 80 }, 			
			{ label: '', name: 'd3', index: 'd3', width: 80 }, 			
			{ label: '', name: 'd4', index: 'd4', width: 80 }, 			
			{ label: '', name: 'd5', index: 'd5', width: 80 }, 			
			{ label: '', name: 'd6', index: 'd6', width: 80 }, 			
			{ label: '', name: 'd7', index: 'd7', width: 80 }, 			
			{ label: '', name: 'd8', index: 'd8', width: 80 }, 			
			{ label: '', name: 'd9', index: 'd9', width: 80 }, 			
			{ label: '', name: 'd10', index: 'd10', width: 80 }, 			
			{ label: '', name: 'd11', index: 'd11', width: 80 }, 			
			{ label: '', name: 'd12', index: 'd12', width: 80 }, 			
			{ label: '', name: 'd13', index: 'd13', width: 80 }, 			
			{ label: '', name: 'd14', index: 'd14', width: 80 }, 			
			{ label: '', name: 'd15', index: 'd15', width: 80 }, 			
			{ label: '', name: 'd16', index: 'd16', width: 80 }, 			
			{ label: '', name: 'd17', index: 'd17', width: 80 }, 			
			{ label: '', name: 'd18', index: 'd18', width: 80 }, 			
			{ label: '', name: 'd19', index: 'd19', width: 80 }, 			
			{ label: '', name: 'd20', index: 'd20', width: 80 }, 			
			{ label: '', name: 'd21', index: 'd21', width: 80 }, 			
			{ label: '', name: 'd22', index: 'd22', width: 80 }, 			
			{ label: '', name: 'd23', index: 'd23', width: 80 }, 			
			{ label: '', name: 'd24', index: 'd24', width: 80 }, 			
			{ label: '', name: 'd25', index: 'd25', width: 80 }, 			
			{ label: '', name: 'd26', index: 'd26', width: 80 }, 			
			{ label: '', name: 'd27', index: 'd27', width: 80 }, 			
			{ label: '', name: 'd28', index: 'd28', width: 80 }, 			
			{ label: '', name: 'd29', index: 'd29', width: 80 }, 			
			{ label: '', name: 'd30', index: 'd30', width: 80 }, 			
			{ label: '', name: 'd31', index: 'd31', width: 80 }, 			
			{ label: '备注', name: 'remark', index: 'remark', width: 80 }			
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
		industrialAccAttendance: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.industrialAccAttendance = {};
		},
		update: function (event) {
			var attendanceId = getSelectedRow();
			if(attendanceId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(attendanceId)
		},
		saveOrUpdate: function (event) {
			var url = vm.industrialAccAttendance.attendanceId == null ? "industrial/industrialaccattendance/save" : "industrial/industrialaccattendance/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.industrialAccAttendance),
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
			var attendanceIds = getSelectedRows();
			if(attendanceIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "industrial/industrialaccattendance/delete",
                    contentType: "application/json",
				    data: JSON.stringify(attendanceIds),
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
		getInfo: function(attendanceId){
			$.get(baseURL + "industrial/industrialaccattendance/info/"+attendanceId, function(r){
                vm.industrialAccAttendance = r.industrialAccAttendance;
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