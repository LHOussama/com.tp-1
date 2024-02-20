<html>
<body>
    <h1 >Compte Rendu</h1>
    <ol id="principale">
        <li> Créer l'interface IDao avec une méthode getDate</li>
            <img src="src/main/resources/Images/question1.png">
        <li> Créer une implémentation de cette interface </li>
            <img src="src/main/resources/Images/question2.png">
        <li> Créer l'interface IMetier avec une méthode calcul</li>
            <img src="src/main/resources/Images/question3.png">
        <li> Créer une implémentation de cette interface en utilisant le couplage faible </li>
            <img src="src/main/resources/Images/question4.png">
        <li >Faire l'injection des dépendances
            <ol id="secondaire">
                <li class="question5"> Par instanciation statique</li>
                    <ol>
                        <li class="q5">Classe presentation statique</li>
                            <img src="src/main/resources/Images/question5_a.png">
                        <li class="q5"> Execution</li>
                            <img src="src/main/resources/Images/question5_a_execution.png">
                    </ol>
                <li class="question5"> Par instanciation dynamique</li>
                    <ol>
                        <li class="q5">Classe presentation dynamique</li>
                            <img src="src/main/resources/Images/question5_b.png">
                        <li class="q5"> Execution</li>
                            <img src="src/main/resources/Images/question5_b_execution.png">
                    </ol>
                <li class="question5"> Version XMl</li>
                    <ol>
                        <li class="q5">Fichier configue.xml </li>
                            <img src="src/main/resources/Images/fichierxml.png">
                        <li class="q5"> Presentation Xml</li>
                            <img src="src/main/resources/Images/classxml.png">
                        <li class="q5"> Execution</li>
                            <img src="src/main/resources/Images/executionxml.png">
                    </ol>
                <li class="question5"> Version Annotations</li>
                    <ol>
                        <li class="q5">Presentation Annotation </li>
                            <img src="src/main/resources/Images/annotation.png">
                        <li class="q5"> Classe Xml</li>
                            <img src="src/main/resources/Images/execution_annotation.png">
                        </ol>
            </ol>
        </li>
    </ol>
<style>
    h1{
        text-align: center;
        color: brown;
    }
    li{ color: blue;
        font-weight: 600;
        padding-bottom: 10px;
    }
    p{
    font-family: Arial;
    font-weight: 500;
    }
    img{
    padding-bottom: 25px;
    padding-top: 25px;
    }
    #secondaire{
        list-style-type: lower-alpha;
    }
    .question5{
        color: cornflowerblue;
        padding-bottom: 10px;
    }
    .q5{
        padding-bottom: 10px;
        color: blueviolet;
        font-size: 0.9em;
        font-weight: 550;
        list-style-type: upper-roman;
    }
</style>
</body>
</html>