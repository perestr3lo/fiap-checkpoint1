## 🚀 README.md

Este repositório contém a aplicação Fiap Checkpoint 01.

### Instruções de Uso

Antes de executar a aplicação, você precisa obter a imagem do Docker Hub. Para fazer isso, utilize o seguinte comando:

```bash
docker pull pallestrelli/fiap-checkpoint1
```

Isso irá baixar a imagem necessária para executar a aplicação em seu ambiente local.

Em seguida, para executar a aplicação a partir do Docker Hub do respectivo membro com perfil "dev", utilize o seguinte comando:

```bash
docker run -d -p 8080:8080 -e PROFILE=dev pallestrelli/fiap-checkpoint1
```

Para executar a aplicação a partir do Docker Hub do respectivo membro com perfil "stg", utilize o seguinte comando:

```bash
docker run -d -p 8080:8080 -e PROFILE=stg pallestrelli/fiap-checkpoint1
```

Para executar a aplicação a partir do Docker Hub do respectivo membro com perfil "prd", utilize o seguinte comando:

```bash
docker run -d -p 8080:8080 -e PROFILE=prd pallestrelli/fiap-checkpoint1
```

## Acesso à Aplicação
Após a execução da aplicação, você poderá acessá-la em `http://localhost:8080/ping`.

Certifique-se de ter o Docker instalado e em execução em sua máquina antes de executar os comandos acima.

## Participantes

Este projeto foi desenvolvido por [Matheus Perestrelo, Gabriel Toledo].
