import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCategoriaAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-button style="margin: var(--lumo-space-m); align-self: center;" theme="primary">
   Categoria
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-categoria-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategoriaAdmin.is, VistaCategoriaAdmin);
