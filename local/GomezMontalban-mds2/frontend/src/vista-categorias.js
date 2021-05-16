import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaCategorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; border: #ccc solid 2px; border-radius : 5px;
">
 <vaadin-vertical-layout>
  <h1>Categorías</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout>
  <vaadin-horizontal-layout>
   <vaadin-horizontal-layout>
    <label style="margin: var(--lumo-space-m);">Categoria</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout id="comboBoxCategorias"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-categorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategorias.is, VistaCategorias);
