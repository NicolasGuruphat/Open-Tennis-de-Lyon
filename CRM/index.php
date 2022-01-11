<?php

function connectDb(){
        $host = 'localhost'; // ou sql.hebergeur.com
        $user = 'root';      // ou login
        $pwd = '';      // ou xxxxxx
        $db = 'testcpoa';
    try {
        $bdd = new PDO('mysql:host='.$host.';dbname='.$db.
                        ';charset=utf8', $user, $pwd,
                    array(PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION));
        return $bdd;
        } catch (Exception $e) {
        exit('Erreur : '.$e->getMessage());
    }
}
$bdd = ConnectDb();
$query = $bdd->prepare('SELECT nom FROM fichevip');
$query->execute();
while ($data = $query->fetch())  
{
    $nom = $data['0'];
    echo "<a href='./fiche.php'>$nom</a><br>";
}
echo $data['0'];
echo "it works !";
