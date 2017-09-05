<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script> 
<script type="text/javascript">
	//请求json响应json
	function requestJson(){
		$.ajax({
			type: 'post',
			url: '${pageContext.request.contextPath }/json/requestJson.action',
			contentType: 'application/json;charset=utf-8',
			data: '{"id":1,"name":"华为手机","price":1999.9}',
			success: function(data){
				alert("id=" + data.id + "\nname=" + data.name + "\nprice=" + data.price);
			}
		});
	}
	//请求key/value响应json
	function responseJson(){
		$.ajax({
			type: 'post',
			url: '${pageContext.request.contextPath }/json/responseJson.action',
			data: 'id=2&name=魅族&price=1499.9',
			success: function(data){
				alert("id=" + data.id + "\nname=" + data.name + "\nprice=" + data.price);
			}
		});
	}
</script>
</head>
<body>
	<input type="button" value="请求json响应json" onclick="requestJson()" />
	<input type="button" value="请求key/value响应json" onclick="responseJson()" />
</body>
</html>