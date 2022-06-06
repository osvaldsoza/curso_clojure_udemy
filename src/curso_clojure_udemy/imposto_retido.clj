(ns curso-clojure-udemy.imposto-retido)

(defn imposto-retido [salario]
  "Se salario abaixo de 1000, não tem imposto. Acima ou igual a 1000. deve aplicar o imposto"
  (let [imposto-padrao 0.2]
    (if (< salario 1000)
      0
      (* salario imposto-padrao))))

(defn taxa-padrao-por-http []
  "Imagine que este código faz uma requisicao de http para obter a taxa padrao"
  0.30)

(defn taxa-padrao-fixa []
  0.10)

"(defn imposto-retido [salario]
  (if (< salario 1000)
    0
    (* salario (taxa-padrao-por-http))))


(defn imposto-retido [taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario taxa-padrao)))"

(defn imposto-retido [fn-aplica-taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario (fn-aplica-taxa-padrao))))



(imposto-retido taxa-padrao-por-http 1000)
(imposto-retido taxa-padrao-fixa 1000)


(defn tipo-de-taxa
  [ambiente]
  (if (= ambiente :test)
    taxa-padrao-fixa
    taxa-padrao-por-http))

(imposto-retido (tipo-de-taxa :test) 1000)
(imposto-retido (tipo-de-taxa :producao) 1000)
(imposto-retido (fn [] 0.7) 3000)
(imposto-retido  #(+ 0.7) 3000)
(imposto-retido (constantly 0.5) 3000)


