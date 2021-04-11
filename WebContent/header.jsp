<style>
*{
	margin:0px;
	padding : 0px;
}
.header {
  overflow: hidden;
  background-color: black;
  padding: 4px 34px;
}

.container
{
	    max-width: 1350px;
}

/* Style the header links */
.header a {
  float: left;
  color: white;
  text-align: center;
  padding: 14px;
  text-decoration: none;
  font-size: 18px;
  line-height: 25px;
  border-radius: 3px;
}

/* Style the logo link (notice that we set the same value of line-height and font-size to prevent the header to increase when the font gets bigger */
.header a.logo {
  font-size: 25px;
  font-weight: bold;
  float:left;
}

/* Change the background color on mouse-over */
.header a:hover {
  background-color: bisque;
  color:white;
}

/* Style the active/current link*/
.header a.active {
  background-color: bisque;
  color: white;
}

/* Float the link section to the right */
.header-right {
  float: right;
}

/* Add media queries for responsiveness - when the screen is 500px wide or less, stack the links on top of each other */
@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  .header-right {
    float: none;
  }
}

</style>


<div class="header">
<div class="container">
  <a href="#default" class="logo">Todo App</a>
  <div class="header-right">
    <a class="active" href="#home">Home</a>
    <a href="login.jsp">Login</a>
    <a href="signup.jsp">Signup</a>
  </div>
</div>
</div>