<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<base href="/simple-jpa-web/" />
		<title>Java Training</title>
	   <link 
	       rel="stylesheet" 
	       href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	       integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	       crossorigin="anonymous"
	   >	
    </head>
	
	<body class="d-flex flex-column" style="min-height: 100vh;">
		<%-- Navbar --%>
	    <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top" role="navigation">
	        <div class="container-fluid">
	
	            <%-- Left side --%>
	            <div class="navbar-header">
	                <a class="navbar-brand" href="categories">
	                    Java training
	                </a>
	            </div>
	
	            <%-- Right side --%>
	            <div class="nav navbar-nav navbar-right">
					<a class="nav-item nav-link" href="#">Dresseurs</a>
				    <a class="nav-item nav-link" href="#">Pokémons</a>
				    <a class="nav-item nav-link" href="categories">Catégories</a>
				    <a class="nav-item nav-link" href="#">Articles</a>
	            </div>
	        </div>
	    </nav>
	    
	    <%-- BODY --%>
		
		<main class="flex-fill py-4">
			<jsp:doBody />
		</main>
		
		<%-- Scripts --%>
		
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	           integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	   	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	           integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	           
	   	<%-- Font Awesome --%>
	   	
	   	<script src="https://kit.fontawesome.com/5f876598f4.js" crossorigin="anonymous"></script>
	
	   	<%-- Footer --%>
	
	   	<div class="footer navbar-fixed-bottom my-5 pt-5 text-muted text-center text-small">
	       <p class="mb-1">&copy; Java Training</p>
	   </div>
	</body>
</html>