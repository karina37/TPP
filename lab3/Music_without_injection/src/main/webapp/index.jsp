<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SQL Query Executor</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<!-- Анимационный фон -->
<div class="background"></div>

<div class="container">
    <!-- Заголовок с эффектом параллакса -->
    <header class="hero">
        <h1>SQL-запити за темою Music для таблиць genre, group, song</h1>
    </header>

    <!-- Карточка формы -->
    <section class="card form-card">
        <h2>Виконайте запит для таблиці:</h2>
        <form action="ExecuteQueryServlet" method="POST">
            <input type="hidden" name="table" value="music">
            <textarea name="query" placeholder="Наприклад: SELECT * FROM music;"></textarea>
            <button type="submit">Виконати запит</button>
        </form>
    </section>

    <!-- Карточка результатов -->
    <section class="card results-card">
        <h2>Результат запиту:</h2>
        <div class="table-container">
            <table>
                ${queryResult} <!-- Динамический вывод данных -->
            </table>
        </div>
    </section>
</div>
</body>
</html>