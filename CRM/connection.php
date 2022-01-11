<?php
class Connection {
        private static $bdd;
        static function connectDb(){
                $host = 'localhost'; // ou sql.hebergeur.com
                $user = 'root';      // ou login
                $pwd = '';      // ou xxxxxx
                $db = 'testcpoa';
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
