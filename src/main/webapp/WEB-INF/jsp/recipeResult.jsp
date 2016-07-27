
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="Common/header.jsp"/>

<h1>Search Results :</h1>

<div class="recipeList container-fluid">
<ul>
	<c:forEach items="${recipes}" var="recipe">
		<c:url value="/recipeResult" var="resultPage">
			<c:param name="recipeByIngredient"/>
		</c:url>
		<div id="recipeCard" class="row col-md-12 col-sm-12 col-xs-12" >
			<ul >
				<li><strong>${recipe.recipeCard}</strong></li>
				<li>${recipe.info}</li>
				<li>${recipe.ingredient}</li>
				<li>${recipe.instructions}<li>
			</ul>
		</div>
	</c:forEach>
</ul>
</div>











<c:import url="Common/footer.jsp"/>
