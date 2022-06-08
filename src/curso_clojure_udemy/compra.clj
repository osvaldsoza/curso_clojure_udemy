(ns curso-clojure-udemy.compra)


{:nome     "Osvaldo"
 :idade    43
 :endereco {
            :rua    "Gerenaral Arthur Koeller,99"
            :bairro "Vila Nova"
            :cidade "Blumenau"
            }}

;; carrinho de compras

(defn compras []
  {:tomate {:qunatidade 2 :preco 0.45}
   :arroz  {:qunatidade 3 :preco 6.45}
   :feijao {:qunatidade 1 :preco 10.00}})

(compras)

(get (compras) :tomate)
((compras) :tomate)
(:tomate (compras))

(println "Preço do tomate:" (:preco (:tomate (compras))))

(conj (compras) {:alface {:quantidade 2 :preco 0.55}})
(dissoc (assoc (compras) :alface {:quantidade 2 :preco 0.55}) :tomate)

(def people {:nome "Osvaldo" :idade 43})
(update people :idade inc)

(update-in (compras) [:tomate :preco] inc)


