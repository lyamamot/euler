(set! *print-length* 10)
(def fibs (lazy-cat [0 1]
	(map + fibs (rest fibs))))

(defn e2 [limit]
	(reduce + (filter #(zero? (mod % 2))
		(take-while #(< % limit) fibs))))

(e2 4000000)
