(ns smallworldnew.states.news
    (:require [reagent.core :as reagent :refer [atom]]))

(def news (atom [   {   :id 1
                        :image "https://www.mlmgroup.com/wp-content/uploads/2017/03/services-buildings-mlm.jpg"
                        :title "Estonia’s Icefire: the fine art of financial technology"
                        :tag "News"
                        :modal true},
                    {   :id 2
                        :image "https://www.mlmgroup.com/wp-content/uploads/2017/03/services-buildings-mlm.jpg"
                        :title "Estonia’s Icefire: the fine art of financial technology"
                        :tag "News"
                        :modal false},
                    {   :id 3
                        :image "https://www.mlmgroup.com/wp-content/uploads/2017/03/services-buildings-mlm.jpg"
                        :title "Estonia’s Icefire: the fine art of financial technology"
                        :tag "News"},
                    {   :id 4
                        :image "https://www.mlmgroup.com/wp-content/uploads/2017/03/services-buildings-mlm.jpg"
                        :title "Estonia’s Icefire: the fine art of financial technology"
                        :tag "News"
                        :modal false}]))

(def members (atom [   {   :id 1
                        :image "https://www.mitinclusiveinnovation.com/wp-content/uploads/2018/05/517_Rithy_Thul.jpg"
                        :title "Rithy Thul"
                        :tag "Co-Founder & CEO"},
                    {   :id 2
                        :image "https://pbs.twimg.com/profile_images/903443282868314112/0KUwFFM5_400x400.jpg"
                        :title "Rithy Thul"
                        :tag "Co-Founder & CEO"},
                    {   :id 3
                        :image "https://timeinnovation.io/TimeInnovation/media/root-common/img/member/image21.jpg"
                        :title "Rithy Thul"
                        :tag "Co-Founder & CEO"},
                    {   :id 4
                        :image "http://ricebowlawards.com/wp-content/uploads/2018/11/Quotes-13-1-1024x1024.jpg"
                        :title "Rithy Thul"
                        :tag "Co-Founder & CEO"}]))


(def invester (atom [   {   :id 1
                            :image "/images/doers-lgoo.png"
                            ,}
                        {   :id 2
                            :image "/images/ISI_GROUP.png"
                            ,}
                        {   :id 3
                            :image "/images/Sabay.png"}]))


(def logoInvestment (atom [   {   :id 1
                                  :image "/images/koompi-logo.png"
                                  ,}
                              {   :id 2
                                  :image "/images/pppg-logo.png"
                                  ,}
                              {   :id 3
                                  :image "/images/wapatao.png"}

                              {   :id 4
                                  :image "/images/camwp-dev.png"}]))
