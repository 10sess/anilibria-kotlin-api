# AniLibria-API [![](https://jitpack.io/v/10sess/anilibria-kotlin-api.svg)](https://jitpack.io/#10sess/anilibria-kotlin-api)

AniLibriaApi — это API, который позволяет разработчикам взаимодействовать с сайтом AniLibria.Tv. API предоставляет поиск тайтлов, получение текущего расписания, работы с избранными пользователя.

<h2>Использование</h2>
<h3>Get Started with `gradle`</h3>

```groovy
dependencies {
    implementation 'com.github.10sess:anilibria-kotlin-api:1.0.0'
}
```

<h2>Получение аниме</h2>

```kotlin
val api = AniLibriaApi()
    
// Получение аниме по id
api.aniLibriaApiService.getTitle(id = 9000)

// Получение аниме по названию
api.aniLibriaApiService.search(searches = "Клинок")
    
// Так же можно указывать несколько названий через запятую
api.aniLibriaApiService.search(searches = "Клинок,бродяга")
```

<h2>Расписание</h2>

```kotlin
val api = AniLibriaApi()
    
// Получение списка аниме в конкретный день
val schedule = api.aniLibriaApiService.getSchedule(days = "0,1,2,3,4,5,6")

// 0 - Понедельник
// 6 - Воскресенье
```

<h2>Случайное аниме</h2>

```kotlin
val api = AniLibriaApi()
val random = api.aniLibriaApiService.getRandom()
```

<h2>Получение sessionId</h2>

```kotlin
val api = AniLibriaApi()

val login = "your login or email"
val password = "your password"
    
val sessionId = api.loginApiService.getSessionId(login, password).sessionId
```
<h2>Пользователь</h2>

Получение [sessionId](#-получение-sessionId)

```kotlin
val api = AniLibriaApi()

// Получение информации о пользователе
val user = api.aniLibriaApiService.getUser(sessionId)
```

<h2>Избранное</h2>

Получение [sessionId](#-получение-sessionId)

```kotlin
val api = AniLibriaApi()
    
// Получение избранных аниме пользователя
val favorites = api.aniLibriaApiService.getFavorites(sessionId)
    
// Добавление в список избранного
api.aniLibriaApiService.addFavorites(sessionId, titleId)
    
// Удаление из списка избранного
api.aniLibriaApiService.removeFavorites(sessionId, titleId)
```

<h2>Обратная связь</h2>
Если у вас возникли вопросы или проблемы, можете связаться со <a href="https://t.me/tensesstsugikuni">мной</a>

<h2>Документация</h2>
Если хотите подробнее ознакомиться с <a href="https://github.com/anilibria/docs/blob/master/api_v3.md">документацией</a>
