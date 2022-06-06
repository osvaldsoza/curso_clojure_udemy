(ns curso-clojure-udemy.if)

(defn imposto-retido
  "Verifica se um salário terá ou náp imposto"
  [salario]
  (let [imposto-faixa-1 0
        imposto-faixa-2 0.1
        imposto-faixa-3 0.2]
    (if (<= salario 1000)
      (* salario imposto-faixa-1)
      (if (< salario 2000)
        (* salario imposto-faixa-2)
        (* salario imposto-faixa-3)))))

(println (imposto-retido 2500))