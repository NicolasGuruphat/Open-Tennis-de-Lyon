<?php
if(isset($_COOKIE["token"])){
    if($_COOKIE["token"]){
        $newURL="./listeVIP.php";
        header('Location: '.$newURL);
    }
}
if(isset($_COOKIE["try"])){
    if($_COOKIE["try"]){
        echo "<p style=\"color:red\">Mauvais mot de passe ou/et identifiant</p>";
    }
}

?>
<form method='post' action="login.php">
    <label for='futilisateur'>Nom d'utilisateur :</label><br>
    <input type='text' id='futilisateur' name='utilisateur'><br><br>
    <label for='fmotDePasse'>Mot de passe :</label><br>
    <input type='password' id='fmotDePasse' name='motDePasse'><br><br>
    <input type='submit' value='Se connecter'>
</form>