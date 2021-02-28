import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-he-olvidado-mi-contrase�a`
 *
 * VistaHeOlvidadoMiContrase�a element.
 *
 * @customElement
 * @polymer
 */
class VistaHeOlvidadoMiContrase�a extends PolymerElement {

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
        return 'vista-he-olvidado-mi-contrase�a';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaHeOlvidadoMiContrase�a.is, VistaHeOlvidadoMiContrase�a);
