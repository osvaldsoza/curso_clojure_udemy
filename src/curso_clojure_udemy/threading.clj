(ns curso-clojure-udemy.threading
  (:require [clojure.string :refer [join upper-case]]))

(def disciplinas [{
                   :nome     "Estrutura de Dados"
                   :semestre 2
                   }
                  {
                   :nome     "Algoritmos"
                   :semestre 1
                   }
                  {
                   :nome     "Inteligência Artificial"
                   :semestre 3
                   }])

(def person {
             :nome "Socrates"
             :age  40
             })

(defn atualizar-person
  [person]
  (update (assoc person :hair-color "gray") :age inc))

(defn atualizar-person
  "Threading fisrt"
  [person]
  (-> person
      (assoc :hair-color "green")
      (update :age inc)))

(atualizar-person person)

(defn disciplinas-restantes
  [disciplinas semestre-atual]
  (let [disciplinas (filter #(>= (:semestre %) semestre-atual) disciplinas)
        nomes-disciplinas (map :nome disciplinas)
        nomes-disciplinas-uppercase (map upper-case nomes-disciplinas)]
    (join ", " nomes-disciplinas-uppercase)))

(defn disciplinas-restantes
  "Threading last"
  [disciplinas semestre-atual]
  (->> disciplinas
       (filter #(>= (:semestre %) semestre-atual))
       (map :nome)
       (map upper-case)
       (join ", ")))

(disciplinas-restantes disciplinas 2)