import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-dar-de-baja-usuario`
 *
 * VistaDarDeBajaUsuario element.
 *
 * @customElement
 * @polymer
 */
class VistaDarDeBajaUsuario extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
