import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';

class VistaFiltrarPorCategoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center;">
 <vaadin-select value="Item one">
  <template>
   <vaadin-list-box selected="0"></vaadin-list-box>
  </template>
 </vaadin-select>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-filtrar-por-categoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaFiltrarPorCategoria.is, VistaFiltrarPorCategoria);
