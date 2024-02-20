<html>
<body>
    <h1 >Compte Rendu</h1>
    <ol id="principale">
        <li> Créer l'interface IDao avec une méthode getDate
            <img src="src/main/resources/Images/question1.png">
        </li>
        <li> Créer une implémentation de cette interface 
            <img src="src/main/resources/Images/question2.png">
        </li>
        <li> Créer l'interface IMetier avec une méthode calcul
            <img src="src/main/resources/Images/question3.png">
        </li>
        <li> Créer une implémentation de cette interface en utilisant le couplage faible
            <img src="src/main/resources/Images/question4.png">
        </li>
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
    }
    p{
    font-family: Arial;
    font-weight: 500;
    }
    img{
    padding-bottom: 10px;
    padding-top: 10px;
    }
    #secondaire{
        list-style-type: lower-alpha;
    }
    .question5{
        color: cornflowerblue;
    }
    .q5{
        color: blueviolet;
        font-size: 0.9em;
        font-weight: 550;
        list-style-type: upper-roman;
    }
</style>
</body>
</html>