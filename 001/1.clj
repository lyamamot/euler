(defn mod3or5? [num]
	(when (or
			(zero? (mod num 3))
			(zero? (mod num 5))
			)
		true)
)
(reduce + (filter mod3or5? (range 1000)))