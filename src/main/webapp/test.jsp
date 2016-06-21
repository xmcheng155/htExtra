<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<OBJECT ID="readicsmk" name="readicsmk" WIDTH="" HEIGHT="" CLASSID="CLSID:7CADB3BA-8645-428A-8D3A-AB9B9CFD7F0B">
</OBJECT>
<input type=button onclick="xopen()" value = "测试" />
<script language="javascript">
function xopen(){
	document.all.readicsmk.ReadClose("2","0"); //
	var com = document.all.readicsmk.ReadIni("2","USB"); //
	//return com;
	alert(com)
	cardno = document.all.readicsmk.ReadCard("2",com);
	alert(cardno);
}
</script>
<html>