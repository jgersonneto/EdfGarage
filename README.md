# EDFGARAGE

### Instrução de Uso

O projeto foi feito em JAVAFX, então alguns procedimento seram necessário ser feito.

      1 - É preciso baixar a biblioteca do JAVAFX no site do gluon ou no link a baixo.
          [JAVAFX - Biblioteca](https://mega.nz/file/a9BGxBZK#6YFb1-qCNGLRLviQNVaUPArVtORU5Z0yxOgQ3CDS-_o)
          Após o download add a biblioteca na IDE ECLIPSE.

      2 - É preciso ir na aba help e nela ir em marketplace. Lá você coloca na busca fx e irá aparecer o plugin para ser instalado.

      3 - É interessante instalar o scene builder. segue abaixo o link.
          [SCENE BUILDER](https://mega.nz/file/2xACUbjR#tvlOGFt3NiBs6lvLVBXUM1ye70S2O0pMI7PryJGpYdg)

      4 - É preciso ir configurar o run configuration. Click com o botão direito no projeto, vá em run As e lá vai ter run configuration.
          vá na aba arguments e em VM arguments coloque o seguinte comando:
          --module-path "C:\Program Files\Java\javafx-sdk-17.0.0.1\lib" --add-modules javafx.controls,javafx.fxml
          você só irá mudar o caminho onde você extraiu a lib do JAVAFX.

      5 - Pronto sua IDE está Pronta para usar.
      
Esse projeto já vem com so dados pré criados, podendo apenas exiber relatório do EDF GARAGEM. Quando o aplicativo abrir você verá três botões(EDFGARAGE, 1 ANDAR, 2 ANDAR).
Ao clicar no EDFGARAGE irá exibir:
      1 - retornar o andar mais livre
      2 - retornar os andares ordenados por vagas livres
      3 - retornar o valor total arrecadado
      
Ao clicar no 1 ANDAR irá exibir um menu com três botões:
      se clicar em ANDAR:
        1 - retornar o total de vagas livre do ANDAR
        
      se clicar em 1 corredor:
        1 - retornar o total de vagas ocupadas do CORREDOR
        
      se clicar em 2 corredor:
        1 - retornar o total de vagas ocupadas do CORREDOR
        
 Ao clicar no 2 ANDAR acontecerá a mesma coisa quando clica no 1 ANDAR
 
 E isso é tudo pessoal!!





