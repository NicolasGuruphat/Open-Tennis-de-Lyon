<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title><?= $title ?></title>
        <link href="style.css" rel="stylesheet" /> 
    </head>
        
    <body>
        <a href="./index.php">
            <img src="./logo.jpg">
        </a>
        <h1>Open tennis - Fiche VIP</h1>
        <div class="fiche">
            <?= $content ?>    
            <div class='interaction'>
                <h2>Ajouter une interaction</h2>
                
                <form method='post' action="./fiche.php?id=<?=$_GET['id'];?>">
                    <label for='fobjet'>Objet :</label><br>
                    <input type='text' id='fobjet' name='objet'><br><br>
                    <label for='fdescription'>Description :</label><br>
                    <input type='text' id='fdescription' name='description'><br><br>
                    <input type='submit' value='Submit'>
                </form>
            </div>
          
        </div>
    </body>
</html>