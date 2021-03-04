import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaDarDeBajaUsuario extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="justify-content: center; align-items: center; height: 50%;">
 <h2>Dar de baja la cuenta</h2>
 <h4>¿Desea dar de baja su cuenta y eliminar las reseñas publicadas de sus productos?</h4>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%; justify-content: center;">
  <vaadin-button theme="primary error" style="margin-right: var(--lumo-space-xl);">
   Cancelar
  </vaadin-button>
  <vaadin-button theme="primary" style="margin-left: var(--lumo-space-xl);">
   Confirmar
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-dar-de-baja-usuario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarDeBajaUsuario.is, VistaDarDeBajaUsuario);
