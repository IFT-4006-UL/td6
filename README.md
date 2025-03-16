# TD8

## Tests composants avec une base de données: LibraryRepositoryHibernate

Implémenter les tests composants pour LibraryRepositoryHibernate avec la base de données H2.

Pourquoi ce sont des tests composants et non des tests unitaires?

## Tests composants avec un API: LibraryResource

Utilisez `JerseyTest` pour implémenter les tests permettant de valider la réponse API `POST /books` de LibraryResource.

#### Réponses attendues :

HTTP 201 CREATED

Si la librarie n'existe pas:

HTTP 404 NOT FOUND

```
{
    "error": "LIBRARY_NOT_FOUND",
    "message": PAS À VALIDER DANS LES TESTS
}
```
Si le livre existe déjà dans la librairie:

HTTP 400 BAD REQUEST

```
{
"error": "BOOK_ALREADY_PRESENT",
"message": PAS À VALIDER DANS LES TESTS
}
```

Réfléchissez aux périmètres de vos tests pour que ce soit bien des tests **composants**.

## Tests multi-composants avec Cucumber

Utilisez `Cucumber` pour implémenter un test multi-composants avec l'API et la base de données en mémoire 
pour la fonctionnalité ci-dessous:

- Lorsqu'un livre est ajouté à la librairie avec `POST /books`, on peut voir le livre dans la librairie avec `GET /books`.