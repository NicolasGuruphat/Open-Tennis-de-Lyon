<?php
include('connection.php');

if(isset($_GET['id']))
{
	Connection::ConnectDb();
	$id=$_GET['id'];
	$bdd=Connection::getBDD();
	$query = $bdd->prepare("SELECT * FROM fichevip where idFiche = $id");
	$query->execute();
	$data = $query->fetch();
	echo $data['0'];
	echo "</br>";
	echo $data['1'];
	echo "</br>";
	echo $data['2'];
	 
}
else
{
	echo "<h1>ID non défini</h1>";
}