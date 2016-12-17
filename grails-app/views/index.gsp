<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Revi-C Revision App</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <asset:link rel="icon" href="fcIcon_v2.ico" type="image/x-ico" />
</head>
<body>
    <content tag="nav">
        <div class="navbar navbar-default navbar-static-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/#">
                    <i class="fa grails-icon">
                        <img src="https://obscure-reef-21087.herokuapp.com/assets/fcIcon_v2-471aa022ab665f1d93d0aafe1de35735.ico" />
                    </i> Revi-C
                </a>
            </div>
            <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">
                <ul class="nav navbar-nav navbar-right">
                    
      <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Subjects <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li class="dropdown-submenu"> <a class="test" href="#">New dropdown <span class="caret"></span></a> <ul class="dropdown-menu"> <li><a href="#">2nd level dropdown</a></li> <li><a href="#">2nd level dropdown</a></li> <li class="dropdown-submenu"> <a class="test" href="#">Another dropdown <span class="caret"></span></a> <ul class="dropdown-menu"> <li><a href="#">3rd level dropdown</a></li> <li><a href="#">3rd level dropdown</a></li> </ul> </li> </ul> </li>
                <li><a href="#">English</a></li>
                <li><a href="#">Science</a></li>
                <li><a href="#">History</a></li>
                <li><a href="#">French</a></li>
            </ul>
        </li>

        
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Sub-Topics <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Linear equations</a></li>
                <li><a href="#">Simultaneous equations</a></li>
                <li><a href="#">Quadratic equations</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">User Profile <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Login</a></li>
                <li><a herf="#">Progress</a></li>
            </ul>
        </li>
    
                </ul>
            </div>
        </div>
    </div>
    </content>

    <div class="no-svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="fcLogo_v2.png" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to the Revision App - happy revising</h1>

            <p>
                This app will allow you to choose your subjects, topics and sup-topics and then to 
                complete the activities related to that topic. When you are ready you can take 
                a topic test.  Your test scores and your activity progress are stored in your
                user profile.
            </p>

            <div id="controllers" role="navigation">
                <h2>Functionality</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            </div>
        </section>
    </div>

</body>
</html>
<script>
$(document).ready(function(){
  $('.dropdown-submenu a.test').on("click", function(e){
    $(this).next('ul').toggle();
    e.stopPropagation();
    e.preventDefault();
  });
});
</script>
<style>
.dropdown-submenu {
    position: relative;
}

.dropdown-submenu .dropdown-menu {
    top: 0;
    left: 100%;
    margin-top: -1px;

}
</style>
