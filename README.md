# TP0 - Tests Unitaires avec JUnit 5

## Objectifs

Ce TP a pour objectifs de se familiariser avec :
- L'installation et la configuration de JUnit 5 dans un projet Maven avec IntelliJ IDEA.
- L'écriture et l'exécution de tests unitaires.
- L'utilisation des annotations, assertions, hypothèses, tests paramétrés et dynamiques de JUnit 5.
- L'application de la méthode d’équivalence de classes pour les cas de tests.

---
Exercices
1. Classe Person
   Méthodes à tester : getFullName(), isAdult()

Cas de test : nom/prénom vides, âge limite (17, 18, 19)

2. Classe Stack
   Méthodes à tester : push(), pop(), peek(), isEmpty(), size()

Cas de test : pile vide, dépassement de capacité, enchaînement push/pop

3. Classe Fibonacci
   Méthode à tester : fibonacci(int n)

Cas de test : n = 0, n = 1, n = 5, n = -1 (exception)

4. Classe Prime
   Méthode à tester : isPrime(int n)

Cas de test : n = 1, n = 2, n = 15, n = 17

5. Classe Factorial
   Méthode à tester : factorial(int n)

Cas de test : n = 0, n = 5, n = -1 (exception)


Bonnes Pratiques
Respecter la règle AAA : Arrange, Act, Assert

Isoler chaque test

Nommer les méthodes de test de manière descriptive

Utiliser des tests paramétrés pour éviter la redondance

***********************************************************************************
#  TP1  Couverture du code

#  Objectifs du TP

Mesurer la couverture du code via les tests unitaires.

Comprendre les critères de couverture :

des lignes

des branches

des conditions

Utiliser IntelliJ IDEA pour analyser la couverture.

Écrire des tests plus complets et robustes.

#  EXERCICES :

Exercice 1 – Palindrome
Méthode à tester : Palindrome.isPalindrome(String s)

Cas de tests unitaires :

palindrome simple  : isPalindrome("kayak") → true

palindrome avec majuscules/espaces : isPalindrome("Esope reste ici et se repose") → true

pas un palindrome : isPalindrome("Bonjour") → false

chaîne vide (par convention) : isPalindrome("") → true

isPalindrome(null) → Exception attendue (NullPointerException)

un seul caractère (ou un seul caractère + espace) : isPalindrome("A ") → true

Bug dans la méthode :


j++;
i--;
doit être remplacé par :

i++;
j--;


Exercice 2 – Anagrammes
Méthode à tester : Anagram.isAnagram(String s1, String s2)

Cas de tests unitaires :

isAnagram("chien", "niche") → true : anagramme

isAnagram("anagramme", "marganeam") → true

isAnagram("abc", "def") → false

isAnagram("abc", "ab") → false : longueurs différentes

isAnagram("A bc", "Cb a") → true : ignore espaces et casse

isAnagram(null, "test") → Exception attendue

isAnagram("test", null) → Exception attendue

Bug dans la méthode :


for (int i = 0; i <= s1.length(); i++) {
devrait être :


for (int i = 0; i < s1.length(); i++) {


Exercice 3 – Recherche binaire


Méthode à tester : BinarySearch.binarySearch(int[] array, int element)

Cas de tests unitaires :

binarySearch([1, 2, 3, 4, 5], 3) → 2 : élément au milieu

binarySearch([1, 2, 3, 4, 5], 1) → 0  : premier

binarySearch([1, 2, 3, 4, 5], 5) → 4  : dernier

binarySearch([1, 3, 5, 7], 4) → -1 : absent

binarySearch([], 1) → -1

binarySearch(null, 3) → Exception attendue

binarySearch([1], 1) → 0 : singleton



Exercice 4 – Équation quadratique**

Méthode à tester : QuadraticEquation.solve(double a, double b, double c)

Cas de tests unitaires :
- `solve(1, -3, 2)` → `[2.0, 1.0]` : delta > 0
- `solve(1, -2, 1)` → `[1.0]` : delta = 0
- `solve(1, 0, 1)` → `null` : pas de solution réelle
- `solve(0, 2, 3)` → Exception attendue (division par 0)

---

Exercice 5 – Chiffres romains

**Méthode à tester** : RomanNumeral.toRoman(int n)

**Cas de tests unitaires :**
- `toRoman(1)` → `"I"`
- `toRoman(4)` → `"IV"`
- `toRoman(9)` → `"IX"`
- `toRoman(58)` → `"LVIII"`
- `toRoman(1994)` → `"MCMXCIV"`
- `toRoman(0)` → **Exception attendue**
- `toRoman(4000)` → **Exception attendue**
- `toRoman(3999)` → `"MMMCMXCIX"`

Bug dans la méthode :

for (int i = 0; i <= symbols.length; i++) {
devrait être :


for (int i = 0; i < symbols.length; i++) {


Exercice 6 – FizzBuzz

Méthode à tester : FizzBuzz.fizzBuzz(int n)

Cas de tests unitaires :

fizzBuzz(3) → "Fizz"

fizzBuzz(5) → "Buzz"

fizzBuzz(15) → "FizzBuzz"

fizzBuzz(7) → "7"

fizzBuzz(0) ou fizzBuzz(-1) → Exception attendue
*******************************************************************************************
#  TP2 : Tests Unitaires et Mocks avec Mockito
#  Objectifs :
Ce TP porte sur la simulation de tests unitaires dans le contexte de jeux de hasard, où nous allons simuler des interactions entre différents objets via le framework Mockito. L'objectif est de tester des méthodes dans un environnement contrôlé, en s'assurant qu'elles se comportent comme attendu dans différents scénarios


Exercice 1 : Initiation
Méthode à tester : additionner(int a, int b) : Cette méthode additionne deux nombres.

Cas de test :
Appel de la méthode additionner :

Tester l'addition de deux nombres positifs.

Tester l'addition d'un nombre positif et d'un nombre négatif.

Tester l'addition de deux nombres négatifs.

Vérification du résultat :

Vérifier que le résultat retourné par additionner correspond à la somme des deux nombres passés en paramètre.

Vérification des appels à la méthode :

Vérifier que la méthode additionner a bien été appelée avec les arguments 2 et 3.

Vérification qu'aucune autre méthode n'a été appelée :

Vérifier qu'aucune autre méthode n'a été appelée sur l'objet après l'appel de la méthode additionner.

Vérification de l'état de l'objet après l'appel de la méthode :

Vérifier que l'état de l'objet est correct après l'exécution de additionner.

Exercice 2 : Mocker un service externe (API)
Méthode à tester : creerUtilisateur(Utilisateur utilisateur) : Cette méthode envoie les informations du nouvel utilisateur à un service API pour créer un utilisateur.

Cas de test :
Configuration du comportement du mock :

Utiliser when(...).thenReturn(...) pour simuler un comportement de la méthode creerUtilisateur de l'API.

Création du service avec le mock :

Créer un objet UserService avec le mock de l'API utilisateur.

Appel de la méthode à tester :

Appeler creerUtilisateur du service UserService.

Vérification de l'appel à l'API :

Vérifier que la méthode creerUtilisateur du mock d'API a été appelée avec les bons paramètres.

Exercice 3 : Mocker un service externe avec différents scénarios
Méthode à tester : creerUtilisateur(Utilisateur utilisateur) : Comme dans l'exercice précédent, mais avec des scénarios supplémentaires.

Cas de test :
Lever une exception (ServiceException) :

Tester le comportement lorsque l'API lance une exception ServiceException.

Erreur de validation :

Tester le comportement en cas d'erreur de validation, en utilisant never() pour s'assurer qu'aucune autre méthode n'a été appelée sur le mock de l'API.

Renvoi d'un ID utilisateur unique :

Vérifier que l'API renvoie un identifiant pour l'utilisateur et vérifier cet ID dans le test.

Utilisation d'un ArgumentCaptor pour capturer les arguments passés à la méthode mockée :

Capturer l'argument Utilisateur passé à creerUtilisateur et vérifier les propriétés de l'objet capturé.

Exercice 4 : Jeu de dés
Méthode à tester : jouer(Joueur joueur, De de1, De de2) : Cette méthode simule le jeu avec deux dés et une banque qui gère les gains et les pertes.

Cas de test :
Jeu fermé :

Tester le cas où le jeu est déjà fermé avant l'appel à la méthode jouer.

Joueur insolvable :

Tester le cas où le joueur n'a pas assez d'argent pour faire un pari et vérifier que la méthode jouer ne touche pas aux dés.

Somme des dés ne vaut pas 7 :

Tester le cas où la somme des dés ne vaut pas 7 et vérifier que le joueur a perdu sa mise.

Somme des dés vaut 7 :

Tester le cas où la somme des dés vaut 7 et vérifier que le joueur double sa mise et que la banque est mise à jour en conséquence.

Banque insolvable après un gain :

Tester le cas où le joueur gagne, mais la banque devient insolvable après le paiement du gain, et vérifier que le jeu se ferme.

Vérification de l'état de la banque après un jeu :

Tester que l'état de la banque est mis à jour correctement après un pari gagnant ou perdant.

Vérification des interactions avec les objets mockés :

Vérifier que les interactions avec les objets Joueur, De et Banque sont correctes. Utiliser verify pour s'assurer que les bonnes méthodes ont été appelées avec les bons paramètres.
****************************************************************************
# TP3 - Tests d'Intégration en Java

## Objectif
Ce TP porte sur l'écriture de tests d'intégration en Java en utilisant JUnit et Mockito. Nous allons tester l'interaction entre différentes classes/modules dans des scénarios complexes croissants : interaction entre services, avec une base de données, et avec une API externe.


## Exercice 1 : Interaction Simple entre Modules

### Description
Dans cet exercice, nous avons deux classes : `UserService` qui interagit avec `UserRepository` pour récupérer des utilisateurs. Nous allons créer un test unitaire qui vérifie que la méthode `getUserById(long id)` appelle correctement la méthode `findUserById` de `UserRepository`.

### Étapes
1. Créez les classes `UserService` et `UserRepository`.
2. Implémentez un test pour vérifier que la méthode `findUserById` est appelée avec le bon paramètre lorsque `getUserById` est invoquée.

## Exercice 2 : Interaction avec une Base de Données avec des Mocks

### Description
Dans cet exercice, nous avons une interaction entre `OrderController`, `OrderService` et `OrderDao`. `OrderController` crée une commande, `OrderService` enregistre cette commande, et `OrderDao` persiste les informations dans une base de données.

### Étapes
1. Créez les classes `OrderController`, `OrderService` et `OrderDao`.
2. Implémentez des tests qui vérifient que `OrderService.createOrder` et `OrderDao.saveOrder` sont appelées correctement.

## Exercice 3 : Intégration d'API avec Mocking

### Description
Dans cet exercice, `ProductService` utilise `ProductApiClient` pour récupérer des informations d'un produit via une API externe. Nous allons tester cette interaction en simulant les réponses de l'API à l'aide de mocks.

### Étapes
1. Créez les classes `ProductService` et `ProductApiClient`.
2. Implémentez des tests pour vérifier que l'appel API fonctionne correctement et gérer les scénarios d'erreur.



## Conclusion
À la fin de ce TP, vous aurez une meilleure compréhension des tests d'intégration et des outils comme JUnit et Mockito pour simuler des interactions entre différents composants d'un système. Ces tests sont cruciaux pour valider la communication entre plusieurs parties d'une application.
****************************************************************************************************************
# TP4 - Tests d’intégration avec Docker et Testcontainers

## Objectifs

Ce TP a pour but de se familiariser avec l’utilisation de **Docker**, **Testcontainers** et **Spring Boot** pour effectuer des tests d’intégration Java robustes et fiables. Vous allez apprendre à :

- Comprendre les bases de Docker et son utilisation pour exécuter des applications dans des conteneurs.
- Utiliser Testcontainers pour effectuer des tests d’intégration dans des conteneurs Docker.
- Effectuer des tests sur une application Spring Boot qui interagit avec une base de données MySQL.
- Analyser et réécrire des tests d’intégration en utilisant Testcontainers pour améliorer leur fiabilité.

Exercice 1: Maîtriser TestContainers
Objectifs de l'exercice
Compiler des parties de l'application en utilisant Docker pour éviter le recours aux mocks
Créer et publier des images Docker ou des conteneurs pour les services nécessaires aux tests.
Utiliser Testcontainers pour simplifier l'exécution des tests d'intégration dans un environnement isolé.


Exercice 2: Tests d'intégration avec Testcontainers pour une application de gestion de tâches
Objectifs de l'exercice
Cloner ou télécharger un projet d'application de gestion de tâches.
Réécrire les tests d'intégration existants en utilisant Testcontainers et Docker.
Exécuter et vérifier le bon fonctionnement des tests d'intégration réécrits.

