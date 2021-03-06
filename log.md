# Journal de bord

## 04/01
### Adrien, Nicolas  

Concernant la base de données, recherche du bon driver JCBD pour MariaDB.  
Plusieurs test d'initialisation de projet on été fait mais sans succès.  

### Hugo  

Mise en place de la base de données et début de génération des données. Multiples problème avec PhpMyAdmin et dans la structure de la base de données.  

## 05/01
### Nicolas  

Bon driver trouvé, initialisation de la branch base de données. Accès réussi à la base de données via Java. Test réussi de requete sur la base de données.  

### Adrien  

Liste des classes nécéssaire au programme :  
- "Liste" des étapes du programmes avec description  
- Description des fonctions importantes  
- Arborescence des conteneurs de l'application (interface)  

### Hugo   

Suite de la mise en place de la base de données, tentative de résolution des problèmes.  
Restructuration de la base de données pour correspondre aux besoin du projet.  

## 06/01
### Nicolas  

Ajout de méthodes à la classe ObjectFactory :
- createJoueurs : créer les objets Joueur (pour l'instant c'est une classe test en attendant qu'Adrien fasse la vraie classe) à partir de la table de la BDD
- createArbitres : fait la même chose que la classe précédente pour les arbitres

Merge de la branch BDD->main en attendant les vrais classes Joueur et Arbitre

initialisation de l'interface

### Adrien  

Initialisation des classes  
Adaptation des associations pour qu'il soit plus orienté programmations


### Hugo   

Suite et fin de la restructuration de la base de données. Finalisation de la génération des données de test.  

## 07/01
### Nicolas

Ajout des éléments à la page de génération de tournois de l'IHM conformement à la maquette  
Modification légères des classes du package métier pour les adapter à la génération d'objets à partir de la BDD  
Génération d'objets à partir de la BDD modifiée pour s'adapter aux classes du package métier  

### Adrien  
Création de moteur.java  
Ajouts des getters des conteneurs  
Début d'ajout des écouteurs dans moteur.java  

### Hugo

Validation de jeux de données et tests de la base de données.
Début de travail sur la partie IHM.

## 11/01 (séance du matin)
### Nicolas

Ajout de la méthode createMatch qui permet de créer les objets match à partir de la BDD  
Conversion du score en Map (dictionnaire).   
Il faudra  adapter la BDD afin que la gagnant soit stocké dans la table match   
Modification de plusieurs classes métier afin d'ajouter des listes static

### Adrien  

Rencontré des dificultés avec git (problème de push et de branches)

### Hugo  
Suite de l'implémentation de l'IHM.

## 11/01 (séance de l'après midi)
### Nicolas

Début de la création de l'application web :   
- Les données sont récupérées depuis la BDD  
- La liste des fiches vip s'affiche sur une première page  
- Lorsqu'on click sur un nom, l'id est passer en GET et est récupérer. Plus tard, cela permettra d'afficher sa fiche en faisant une nouvelle requete dans la BDD  

### Adrien  

Ecouteurs fonctionnelles dans moteurs (test des écouteurs valide)  
Debut de la méthode générerMatchs()  

### Hugo  
Suite de l'implémentation de l'IHM, tentative de résolution de certains problèmes.

## 13/01 
### Nicolas

Suite de la création de l'application web :
- Finalisation des accès à la BDD dans fiche.php : maintenant les informations du VIP s'affichent sur une autre page, la page fiche
- Mise en place d'un template pour la fiche
- Début du visuel   
- Début du form qui permet d'ajouter des interactions dans les fiches

### Adrien

- Ajout des associations listeTerrain, listeHorraire, terrain, horraire dans Matchs  
- Supprésion des autre associations entre les classes horraire, terrain et matchs  
- Suppresion de l'interface terrain, remplacée par une classe terrain  
- Ajout et suppression des getters et setter liés attribut ajouté/supprimé  

### Hugo

- Résolution des problèmes lié à l'interface de l'arbre de matchs.
- Aide à la résolution de problèmes liés aux associations dans la base de données.

## 14/01
### Nicolas

Fin du form d'ajout d'interactions:
- Les données du form sont envoyées à la base de données

Les données sont également récupérées pour afficher les interactions liées à la fiche

Début du système d'authentification :
- Mise en place du form de login    

#### Adrien  
  
-Création des constructeurs a partir de la base de données (Joueur, Arbitres, Matchs, Terrain)  
-Début du constructeur horaire  

## 18/01 (séance en autonomie de 2 heures)
### Nicolas
-Fin du système d'authentification : accès à la page de liste des VIP. Utilisation de l'algo de hashage sha512 afin de stocker le mdp de manière sécurisé. Lors de l'authentification, l'input est hashé pour effectuer la correspondance  

#### Adrien  
-Fin du constructeur horraire  


## 18/01 
### Nicolas
Ajout de cookies qui gèrent l'authentification :
- l'accès aux pages est maintenant refusé si vous n'êtes pas authentifié
- l'authentification met en place un cookie qui expire au bout de 15 minutes
- si l'utilisateur essaie d'aller sur la page d'authentification alors qu'il est déjà authentifié, il est redirigé sur la page liste vip
- affichage d'un message si mauvais mot de passe ou identifiant

Bug d'auto-increment reglé (il bloquait le fait d'ajouter plusieurs interactions). Le back-end est donc maintenant complétement fonctionnel

Champs lors de la création d'un interactions sont maintenant obligatoires  

#### Adrien  
-Ajout du constructeur Terrain  
-debut de la méthode générerArbre()  


## 19/01 (séance du matin) 
### Nicolas
Restructuration globale de la BDD avec Hugo car beaucoup de problèmes avec les clés étrangères  

#### Adrien  
-Debut de la méthode créerMatch() a partir de 2 matchs précédents  
-début de la méthode assignerArbitre()


## 19/01 (séance autonomie à 12h30 + séance de l'après midi)
### Nicolas
Adaptation de l'application web à la nouvelle base de données  

#### Adrien  
-Fin de la méthode générerArbre()    


## 20/01  

#### Adrien  
-Fin de la méthode assignerArbitre()
-Fin de la méthode créerMatch()
-Ajout d'un deuxieme constructeur Match (il y a des matchs crée par générerArbre() et des matchs crée par créerMatch() )  

## 23/01 (séance autonomie de 4 heures)  

#### Adrien  

-Ajout des méthodes comparerScore(), modifierTerrain(), ModifierScore()  
-Ajout modification du constructeur RamasseurBalle + ajout attribut listeRamasseurs  
-Début de la méthode VérifierScoreMatch qui sera associé a un écouteur dans la partie IHM  

