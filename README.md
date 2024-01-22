<h1 align="center" style="font-weight: bold;">Desafio Precato (Adaptado) 💻</h1>

<p align="center">
<a href="#informations">Informations</a> •
<a href="#tech">Technologies</a> • 
<a href="#routes">API Endpoints</a> •
</p>

<p align="center">
    <b>Desafio para vaga back-end júnior Precato.</b>
</p>

<h2 id="informations">🎯 Informações</h2>

Para o desafio para vaga de back-end júnior de Precato foi necessário desenvolver uma APIRest usando NodeJS contendo dois endpoints.
1- Atualizar as informações do sms , conforme seu id. 
2- Obter uma lista dos sms que contem o status informado como parâmetro (ENVIADO,RECEBIDO, ERRO DE ENVIO).

Como não estou concorrendo a vaga realizei o desafio em Java (Spring).

<h2 id="technologies">💻 Tecnologias</h2>

- Java
- MySQL
- Spring

<h2 id="routes">📍 API Endpoints</h2>


​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /status</kbd>     | Filtra e mostra as informações de todos sms que possuem o satus informado.
| <kbd>PUT /id_sms</kbd>     | Atualiza as informações do sms que possui o id informado.

<h3 id="get-auth-detail">GET/status</h3>

**RESPOSTA**
```json
{
  "status": "RECEBIDO",
  "mensagem": "Olá, Boa Noite!",
  "phone": "(11)99253567",
  "idSms": 102
}
```
A resposta será uma lista de todas os sms que tem esse status, cada um com esse modelo de resposta JSON.
<h3 id="post-auth-detail">PUT/id</h3>

**ENVIO**
```json
{
  "status": "RECEBIDO",
  "mensagem": "Olá, tudo bem?"
  "phone": "(11)99245714"
   
}
```
Os campos mensagem e phone não precisam ser passados, ficando os que já estão. O campo status é obrigatório.
**RESPOSTA**
```json
{
  "status": "RECEBIDO",
  "mensagem": "Olá, tudo bem?"
  "phone": "(11)99245714",
  "idSms": 102

}
```


