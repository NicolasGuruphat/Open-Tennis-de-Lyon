<?php $title = 'FicheVip';?>

<?php ob_start(); ?>
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
	echo "Identifiant : ".$data['0'];
	echo "</br>";
	echo "Nom : ".$data['1'];
	echo "</br>";
	echo "Prénom : ".$data['2'];
	echo "</br>";
	echo "Date de naissance : ".$data['3'];
	
}
else
{
	echo "<h1>ID non défini</h1>";
}
?>
<?php $content = ob_get_clean(); ?>

<?php require('template.php'); ?>