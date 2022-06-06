(ns curso-clojure-udemy.predicates)

(defn isento-de-imposto?
  [valor]
  (<= valor 1000))

(println (isento-de-imposto? 1000))
