val lambda: (Long, Long) -> Long = {l, r ->  (l..r).reduce {acc, i ->  acc * i}}

