﻿<?php
$host="localhost";
$username="root";
$password="";
$database="quanao";
$conn=mysqli_connect($host,$username,$password,$database);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
  }
?>
