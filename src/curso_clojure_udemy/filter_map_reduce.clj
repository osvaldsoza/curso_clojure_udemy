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
