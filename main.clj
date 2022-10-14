; 1. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  ultimo  que  receba  uma  lista  e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn ultimo [listaDeNumeros]
  (if (= (count listaDeNumeros) 1)
    (first listaDeNumeros)
    (ultimo (rest listaDeNumeros))))

(println "considere a lista '(8 58 39 78 21 9 3 22); resposta:" (ultimo '(8 58 39 78 21 9 3 22)))

; 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e  devolva  o  penúltimo  elemento  desta  lista  usar as  funções  já  prontas  e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn penultimo [listaDeNumeros]
  (if (= (count listaDeNumeros) 2)
    (first listaDeNumeros)
    (penultimo (rest listaDeNumeros))))

(println "considere a lista '(8 58 39 78 21 9 3 22); resposta:" (penultimo '(8 58 39 78 21 9 3 22)))

; 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o  elemento que  está na  posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure

(defn elementoN [lista N]
  (if (= N 0)
    (first lista)
    (elementoN (rest lista) (- N 1))))

(println "considere a lista '(8 58 39 78 21 9 3 22) 3; resposta:" (elementoN '(8 58 39 78 21 9 3 22) 3))

; 4. Utilizando  a  linguagem Clojure,  crie  uma função  chamada  inverso  que  receba uma  lista  e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn inverso [lista]
  (if (= (count lista) 0)
    []
    (conj (inverso (rest lista)) (first lista))))

(println "considere a lista '(8 58 39 78 21 9 3 22); resposta:" (inverso '(8 58 39 78 21 9 3 22)))

; 5. Utilizando a  linguagem Clojure, crie uma função chamada  mdc que receba  dois inteiros e devolve o mínimo divisor comum entre eles.  Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn resto [a b]
  (if (>= a b)
    (resto (- a b) b)
    a))

(defn mdc [a b]
  (if (= b 0)
    a
    (mdc b (resto a b))))

(println "mdc: entrada: 12 18; resultado:" (mdc 12 18))