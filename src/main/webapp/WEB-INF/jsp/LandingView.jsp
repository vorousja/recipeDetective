<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/WEB-INF/jsp/Common/header.jsp"/>




<h3 class="landingHeadline">Enter ingredients to be used in recipe</h3>

<form action="recipeResult" class="formClass" method=GET>
	<input class="inputClass" type="text" name="enteredIngredients" style="color:#888;" 
    value="Recipes that have..." onfocus="inputFocus(this)" onblur="inputBlur(this)"/>
    <span class="icon fa fa-search"></span>
	
</form>





<c:import url="Common/footer.jsp"/>


