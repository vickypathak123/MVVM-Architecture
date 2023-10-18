# <p align="center"><a name="_w3kedzei6uey"></a>**MVVM ROADMAP**</p>

## <a name="_z72j9xs9edru"></a>**Day - 1,2,3  About MVVM**
1. [Introduction to MVVM (Model-View-ViewModel)](https://www.codingninjas.com/studio/library/android-mvvm-model-view-viewmodel-architecture)
1. Component of MVVM ([Model](https://www.digitalocean.com/community/tutorials/kotlin-data-class), [View](https://www.usna.edu/Users/cs/adina/teaching/it472/spring2021/course/page.php?shortname=mobileos&id=5), [ViewModel](https://androidwave.com/viewmodel-android-example/))
1. [Repository](https://digital-solutions.consulting/uncategorized/repository-in-androids-mvvm-architecture/)
1. [Example of MVVM](https://dev.to/whatminjacodes/simple-example-of-mvvm-architecture-in-kotlin-4j5b)

## <a name="_cnrdu1ci1ar5"></a>**Day - 4,5,6,7 Binding and Observers**
1. [ViewBinding](https://medium.com/@abhineshchandra1234/view-binding-in-kotlin-android-bda2b35d3e29) ([Example](https://www.section.io/engineering-education/view-binding-in-android/))
1. [DataBinding](https://blog.logrocket.com/data-binding-android-tutorial-with-examples/)** ([Example](https://www.section.io/engineering-education/how-to-use-databinding-in-android-using-kotlin/))
1. [LiveData](https://www.innominds.com/blog/introduction-to-livedata-in-android) ([Example](https://medium.com/@abuhasanbaskara/android-kotlin-live-data-mutable-live-data-example-b6a11e4d5b48))
1. [DataBinding vs ViewBinding](https://kingahmedino.hashnode.dev/data-binding-vs-view-binding)

## <a name="_9dp37twrw5aw"></a>**Day - 8,9 Coroutine**
1. [Kotlin Coroutine](https://amitshekhar.me/blog/kotlin-coroutines)
1. [Coroutine Scope](https://www.geeksforgeeks.org/scopes-in-kotlin-coroutines/)

## <a name="_yk7g1ibq9c8i"></a>**Day - 10,11,12,13 Dependency Injection**
1. [Introduction to Dependency Injection](https://www.kodeco.com/books/advanced-android-app-architecture/v1.0/chapters/5-dependency-injection)
1. [Hilt Framework](https://www.scaler.com/topics/hilt-android/) ([Example](https://www.howtodoandroid.com/android-hilt-dependency-injection/))
1. [Hilt Cheat Sheet](https://developer.android.com/training/dependency-injection/hilt-cheatsheet)

## <a name="_sjeibl1skyo3"></a>**Advance Topic (Optional)**
1. [RxJava](https://www.toptal.com/android/functional-reactive-android-rxjava) ([Example](https://medium.com/@gabrieldemattosleon/fundamentals-of-rxjava-with-kotlin-for-absolute-beginners-3d811350b701))
1. [Kotlin Flow](https://www.simplilearn.com/tutorials/kotlin-tutorial/an-ultimate-guide-to-kotlin-flows) ([Example](https://blog.mindorks.com/what-is-flow-in-kotlin-and-how-to-use-it-in-android-project/))


## [**Example of MVVM with Hilt + Coroutines + Flow**](https://www.howtodoandroid.com/android-app-using-mvvm-coroutines-flow-hilt/)
![Alt text](https://imageupload.io/ib/hYsbusZ5B2ypOIN_1697608580.png)

# <p align="center"><a name="_w3kedzei6uey"></a>**Key Points**</p>
<div align="justify">
Using the Model-View-ViewModel (MVVM) architecture in Android applications offers several advantages in terms of maintainability, testability, and scalability. Here are the key points to keep in mind when using MVVM architecture:<br><br>
1. Separation of Concerns:<br>
MVVM separates the user interface (View) from the application logic (ViewModel) and the data (Model). This clear separation makes the codebase easier to understand, maintain, and extend.<br><br>
2. View:<br>
The View represents the UI components of the application.
It observes ViewModel for any changes in the data and updates the UI accordingly.
Should not contain business logic; instead, it delegates user interactions and data presentation to the ViewModel.<br><br>
3. ViewModel:<br>
ViewModel is responsible for managing the UI-related data.
It exposes the data to the View using LiveData or RxJava Observables, ensuring that the UI is always up-to-date.
Contains business logic, communicates with the Model, and prepares data for the View.
It survives configuration changes, such as screen rotations, ensuring data consistency.<br><br>
4. Model:<br>
The Model represents the data and business logic of the application.
It is responsible for retrieving and storing data, and it can be a database, network request, or any other data source.
Should be independent of the UI and the presentation logic.<br><br>
5. LiveData (or RxJava):<br>
LiveData is a lifecycle-aware observable data holder class. It is used to notify Views about changes in the underlying data.
LiveData automatically handles lifecycle management, ensuring that the UI components observe the data only when they are active.
RxJava can also be used for reactive programming and asynchronous data streams.<br><br>
6. Data Binding:<br>
Data Binding library can be utilized to bind UI components in the XML layout files directly to the ViewModel.
This eliminates the need for boilerplate code to update UI elements manually, making the codebase more readable and maintainable.<br><br>
7. Dependency Injection:<br>
Dependency injection frameworks like Dagger or Hilt can be used to provide dependencies to ViewModel classes.
This promotes a modular and testable code structure.<br><br>
8. Unit Testing:<br>
MVVM architecture facilitates unit testing of ViewModel classes because business logic is decoupled from the Android framework.
Mock objects can be used to isolate and test ViewModel behaviors independently.<br><br>
9. Reactive Programming (Optional):<br>
Reactive programming paradigms, such as RxJava, can be used to handle asynchronous operations and data streams effectively.
Observables and operators simplify complex asynchronous tasks.<br><br>
10. Navigation Component (Optional):<br>
Android Navigation Component can be integrated to handle navigation between different fragments and activities in a MVVM architecture.
It simplifies the navigation flow and back stack management.<br><br>
By following these key points, developers can create well-organized, maintainable, and testable Android applications using the MVVM architecture.
</div>
