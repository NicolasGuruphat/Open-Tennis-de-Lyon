<?php
include 'connection.php';

Connection::ConnectDb();
$bdd=Connection::getBDD();
$query = $bdd->prepare('SELECT nom,idFiche FROM fichevip');
$query->execute();
while ($data = $query->fetch())  
{
    $nom = $data['0'];
    $id= $data['1'];
    echo "<a href=\"./fiche.php?id=$id\">$nom</a><br>";
    
}
echo $data['0'];

