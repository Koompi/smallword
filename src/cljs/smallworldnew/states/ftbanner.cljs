(ns smallworldnew.states.ftbanner
    (:require [reagent.core :as reagent :refer [atom]]))

(def ftbanner (atom [   {   :id 1
                            :image "/images/blurb-1.png"
                            :title "buildings Startup Community"
                            :tag "Estonia’s Icefire: the fine art of financial technology",}
                        {   :id 2
                            :image "/images/blurb-2.png"
                            :title "Investment Portfolio"
                            :tag "Estonia’s Icefire: the fine art of financial technology"},
                        {   :id 3
                            :image "/images/blurb-3.png"
                            :title "Internal Venture Building"
                            :tag "Estonia’s Icefire: the fine art of financial technology"},
                        {   :id 4
                            :image "/images/blurb-4.png"
                            :title "Invest Long-term Reforest"
                            :tag "Estonia’s Icefire: the fine art of financial technology"}]))
