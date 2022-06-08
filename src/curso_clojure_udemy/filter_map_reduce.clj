(ns curso-clojure-udemy.filter-map-reduce)


"(defn esta-no-quinto-ano?
  [ano]
  (= ano 5))

(defn quantidade-estudantes-no-quinto-ano
  [series]
  (count (filter esta-no-quinto-ano? series)))"

"(defn quantidade-estudantes-no-quinto-ano
  [series]
  (count (filter (fn [ano] (= ano 5)) series)))"

(defn quantidade-estudantes-no-quinto-ano
  [series]
  (count (filter #(= 5 %) series)))

(def series [5, 6, 7, 8, 9, 5, 5, 5])

(quantidade-estudantes-no-quinto-ano series)

(defn soma-das-idades
  [idades]
  (reduce + idades))

(def idades [30 45 25])
(soma-das-idades idades)


(def nomes ["Marcio" "Joao" "Osf" "Tiago" "Tama" "Ana" "Fernanda"])

(defn tamanho-medio-dos-nomes
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))

(tamanho-medio-dos-nomes nomes)

(defn tamanho-medios-dos-nomes-maior-que-3
  [nomes]
  (let [nome-maior-que-3 #(> % 3)
        nomes-maior-3 (filter nome-maior-que-3 (map count nomes))
        soma-dos-carcteres (reduce + nomes-maior-3)]
    (double (/ soma-dos-carcteres (count nomes-maior-3)))))
sh

(tamanho-medios-dos-nomes-maior-que-3 nomes)