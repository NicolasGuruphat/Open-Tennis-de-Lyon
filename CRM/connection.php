<?php
class Connection {
    private static $bdd;
    static function connectDb(){
            $host = 'iutdoua-web.univ-lyon1.fr'; // ou sql.hebergeur.com
            $user = 'p2003245';      // ou login
            $pwd = '564094';      // ou xxxxxx
            $db = 'p2003245';
        try {
            self::$bdd = new PDO('mysql:host='.$host.';dbname='.$db.
                            ';charset=utf8', $user, $pwd,
                        array(PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION));
            } catch (Exception $e) {
            exit('Erreur : '.$e->getMessage());
        }
    }
    static function getBDD(){
            return self::$bdd;
    }
}
