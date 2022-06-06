(ns curso-clojure-udemy.let)

(defn valor-multa
  "Calcula o valor da multa"
  [valor valor-taxa]
  (let [taxa valor-taxa]
    (* valor taxa)))

(println (valor-multa 1000 0.5))

(defn valor-total
  "Calcular o valor total incluindo a multa"
  [valor percentual-multa]
  (let [percentual percentual-multa
        indice 1]
    (* valor (+ indice (/ percentual 100)))))

(println (valor-total 10000 10))