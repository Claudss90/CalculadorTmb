🧑‍⚕️ Calculadora de Metabolismo Basal (BMR) - Java
Este projeto foi desenvolvido para ajudar você a calcular o seu metabolismo basal — a quantidade de calorias que o seu corpo queima em repouso durante um dia. Seja para monitorar a saúde, planejar uma dieta ou otimizar seus treinos, essa ferramenta vai te dar uma visão clara de como o seu corpo funciona!

🔥 O que é o Metabolismo Basal (BMR)?
O Metabolismo Basal (BMR) é a quantidade mínima de calorias necessárias para que o seu corpo funcione enquanto você está em repouso completo. Isso inclui as calorias usadas para funções vitais como respirar, circulação sanguínea e a regulação da temperatura corporal. O cálculo do BMR é um excelente ponto de partida para entender como seu corpo usa energia ao longo do dia.

🧑‍💻 Como Funciona?
Este programa usa a fórmula Harris-Benedict, uma das mais conhecidas para calcular o BMR, baseada em fatores como:

Sexo
Peso
Altura
Idade
Com esses dados, a calculadora vai estimar a quantidade de calorias que seu corpo queima sem fazer nenhuma atividade física. Simples, não é?

💡 Como Usar?
Clone o repositório para o seu computador:

bash
Copiar código
git clone https://github.com/seu-usuario/calculadora-bmr.git
Navegue até a pasta do projeto:

bash:
Copiar código
cd calculadora-bmr
Compile e execute o código Java:

bash:
Copiar código
javac CalculadoraBMR.java
java CalculadoraBMR
O programa pedirá para você inserir:

Seu sexo (M ou F)
Seu peso (em kg)
Sua altura (em cm)
Sua idade (em anos)
O cálculo do seu BMR será exibido, mostrando quantas calorias você queima por dia em repouso.

📊 Fórmulas de Cálculo
Homens:

𝐵
𝑀
𝑅
=
88.362
+
(
13.397
×
peso em kg
)
+
(
4.799
×
altura em cm
)
−
(
5.677
×
idade em anos
)
BMR=88.362+(13.397×peso em kg)+(4.799×altura em cm)−(5.677×idade em anos)
Mulheres:

𝐵
𝑀
𝑅
=
447.593
+
(
9.247
×
peso em kg
)
+
(
3.098
×
altura em cm
)
−
(
4.330
×
idade em anos
)
BMR=447.593+(9.247×peso em kg)+(3.098×altura em cm)−(4.330×idade em anos)
🎯 Objetivo do Projeto
Este projeto foi criado com o objetivo de:

Educar sobre o BMR: Explicar de forma simples o que é o metabolismo basal e como ele afeta nossas necessidades calóricas.
Facilidade de Uso: Ser uma ferramenta prática para calcular o BMR sem complicação.
Aplicabilidade: Ajudar pessoas que buscam otimizar sua saúde, dieta e treinos com base no cálculo preciso do BMR.
📄 Requisitos
Para rodar o programa, você precisará de:

Java 8+ instalado no seu computador
Editor de código (Recomendado: VSCode, IntelliJ IDEA, ou Eclipse)
⚙️ Melhorias Futuras
Estou sempre em busca de melhorias! Aqui estão algumas ideias que podem ser implementadas no futuro:

📊 Adicionar cálculo com base no nível de atividade física (para estimar as calorias totais diárias).
💻 Interface gráfica para tornar a experiência do usuário ainda mais amigável.
🌐 Aplicativo Web ou Mobile para facilitar o acesso a qualquer momento.
🛠️ Contribuindo
Se você quiser ajudar a melhorar este projeto, fique à vontade para enviar pull requests com melhorias, correções ou novas funcionalidades! Vamos construir juntos!

