<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
*{
    margin: 0px;
    padding: 0px;
    box-sizing: border-box;
    font-family: Helvetica, Arial, sans-serif;
    /* background-color: antiquewhite; */

}
section{
    background-color: rgb(247, 247, 247);
    width: 100vw;
    height: 100vh;
    display: flex;
    align-items: center;
    justify-content: center;


}
div{
    display: block;
    
}
img{
 
 width: 301px;
 height: 106px;
 

}
p
{
 font-size: 30px;
}
#login-box
{
    background-color: white;
    width: 400px;
    height: auto;
    margin:auto;
    padding:10px;
    border-radius:  10px;
    box-shadow:0px 0px 10px black;
    text-align: center;
}

#login-box input{ 
    background-color: white;
    width: 370px;
    height: 54px;
    margin-bottom: 10px;
    padding-left: 20px;
    border:solid 1px rgb(248, 208, 208);
    border-radius: 7px;
    


}
#login-btn
{
    color: white;
    font-size: 22px;
    font-weight: bold;
     background-color: blue;
     width: 370px;
     height: 54px;
     margin-bottom: 15px;
     border: none;
     border-radius: 7px;
}
#new-btn
{
    color: white;
    font-size: 20px;
    background-color: rgb(11, 187, 11);
    width: 200px;
    height: 50px;
    border: none;
    border-radius: 10px;
    margin-top: 10px;
    padding: 5px;

}
hr{
    margin: 15px;
    
    border-bottom: 0px light  #dadde1;
}
a{
   font-size: 15px;
    text-decoration: none;
    color: blue;
}

</style>
</head>
<body>
 <section>
        <div >
            <!-- <h1 >facebook</h1> -->
            <img src="https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg" alt="">
            <p>Facebook helps you connect and share <br>
            with the people in your life </p>

        </div >
        <div id="login-box">
        
        <form action="">
            <input type="text" placeholder="Email address or phone number" class="email"> <br><br>
            <input type="password" name="" id="" placeholder="Password" class="email"> <br><br>
            <!-- <button  value="Log in" class="login" ><br><br> -->
                <button id="login-btn">login</button>
            <a href="">Forget password</a><br><hr>
            <button id="new-btn">create new account</button>
             <br>
            <!-- <input type="submit" value="Create New Account"> -->
        </form>
        
</div>
        
    </section>
    

</body>
</html>