
# Curso de Java: Herança, Polimorfismo e Interfaces ☕

Repositório dedicado aos estudos avançados de Programação Orientada a Objetos (POO) em Java, cobrindo conceitos fundamentais de herança, abstração, contratos através de interfaces, polimorfismo, conversão de tipos (*casting*) e a hierarquia base da linguagem.

---

## 📌 Conteúdos Abordados

* **Herança (`extends`)**: Reutilização de código, especialização de classes e inicialização com `super`.
* **Modificador `final`**: Restrição de extensão em classes, sobrescrita de métodos e criação de constantes.
* **Classes e Métodos Abstratos**: Definição de modelos base sem instanciação direta (`abstract`).
* **Interfaces (`implements`)**: Definição de contratos, desacoplamento e herança múltipla de tipos.
* **Polimorfismo e *Casting***: Manipulação polimórfica de objetos, *upcasting*, *downcasting* e verificação de tipos com `instanceof`.
* **Classe `Object`**: Sobrescrita e comportamento dos métodos base da hierarquia do Java (`toString`, `equals`, `hashCode`).

---

## 📂 Estrutura do Projeto

```text
src/
└── com/gabriel/cursojava/
    ├── aulaheranca/              # Fundamentos de herança com Pessoa, Aluno e Professor
    ├── aulapalavrafinal/         # Aplicação da palavra-chave final e constantes
    ├── aulaclasseabstrata/       # Estruturas com classes e métodos abstratos
    ├── aulainterface/            # Regras de negócio, serviços financeiros e meios de pagamento
    │   └── atividade/            # Exercícios com figuras geométricas (2D e 3D)
    ├── aulacastingeof/           # Conversões de tipos e verificação com instanceof
    └── aulaclasseaobjectt/       # Exploração e sobrescrita de métodos da classe Object
