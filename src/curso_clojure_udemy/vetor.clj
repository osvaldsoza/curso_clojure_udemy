(ns curso-clojure-udemy.vetor)

"
(defn imprime-primeiro-nome
  [nomes index]
  (println (nomes index)))"

(defn imprime-primeiro-nome
  [nomes index]
  (println (get nomes index "Nome não encontrado")))

(def nomes ["osvaldo" "andreia" "mateus" "amanda" "ingrid"])

(imprime-primeiro-nome nomes 2)


(defn substituir-primeiro-nome
  [nomes novo-nome]
  (assoc nomes 0 novo-nome))

(println (substituir-primeiro-nome nomes "patricia"))